import java.util.ArrayList;
import java.util.List;
// Listener that converts Tabloid source to Python code

public class TabloidToPythonListener extends TabloidBaseListener {
// Buffer for the generated Python code
    private StringBuilder pythonCode = new StringBuilder();
	 // Current indentation level
    private int indentLevel = 0;
// Create indentation matching the current level
    private String indent() {
        return "    ".repeat(indentLevel);
    }
// Return the generated Python code as a String
    public String getPythonCode() {
        return pythonCode.toString();
    }

    @Override
    public void enterAnathesi(TabloidParser.AnathesiContext ctx) {
		  // Assignment
        String var = ctx.ID().getText();
        String expr = transformExpr(ctx.ekfrasi().getText());
        pythonCode.append(indent()).append(var).append(" = ").append(expr).append("\n");
    }

    @Override
    public void enterEktypwsi(TabloidParser.EktypwsiContext ctx) {
		        // Print statement

        String expr = transformExpr(ctx.ekfrasi().getText());
        pythonCode.append(indent()).append("print(").append(expr).append(")\n");
    }
        // Function return

    @Override
    public void enterEpistrofi(TabloidParser.EpistrofiContext ctx) {
		

        if (ctx.ekfrasi() != null) {
            String expr = transformExpr(ctx.ekfrasi().getText());
            pythonCode.append(indent()).append("return ").append(expr).append("\n");
        } else {
            pythonCode.append(indent()).append("return\n");
        }
    }
        // Function definition

    @Override
    public void enterDhmiourgiasynartishs(TabloidParser.DhmiourgiasynartishsContext ctx) {
        String name = ctx.ID().getText();
        List<String> params = new ArrayList<>();
        for (var param : ctx.parametroi().ID()) {
            params.add(param.getText());
        }
        pythonCode.append(indent())
                  .append("def ").append(name).append("(")
                  .append(String.join(", ", params))
                  .append("):\n");
        indentLevel++;
         // Increase indent for function body
    }
// Decrease indent when the function ends
    @Override
    public void exitDhmiourgiasynartishs(TabloidParser.DhmiourgiasynartishsContext ctx) {
        indentLevel--;
    }
        // If statement with condition

    @Override
    public void enterIf(TabloidParser.IfContext ctx) {
        String left = transformExpr(ctx.synthiki().ekfrasi(0).getText());
        String op = convertOperator(ctx.synthiki().sygkritis().getText());
        String right = transformExpr(ctx.synthiki().ekfrasi(1).getText());

        pythonCode.append(indent())
                  .append("if ").append(left).append(" ").append(op).append(" ").append(right).append(":\n");
        indentLevel++;
    }

    @Override
    public void exitIf(TabloidParser.IfContext ctx) {
        indentLevel--;
        if (ctx.getText().contains("LIES!")) {
            pythonCode.append(indent()).append("else:\n");
            indentLevel++;
        }
    }
        // While loop

    @Override
    public void enterWhile(TabloidParser.WhileContext ctx) {
        String left = transformExpr(ctx.synthiki().ekfrasi(0).getText());
        String op = convertOperator(ctx.synthiki().sygkritis().getText());
        String right = transformExpr(ctx.synthiki().ekfrasi(1).getText());

        pythonCode.append(indent())
                  .append("while ").append(left).append(" ").append(op).append(" ").append(right).append(":\n");
        indentLevel++;
    }

    @Override
    public void exitWhile(TabloidParser.WhileContext ctx) {// Termatismos to while block
        indentLevel--;
    }

    @Override
    public void enterKlhsh(TabloidParser.KlhshContext ctx) {
                // Function call with arguments

        String funcName = ctx.ID().getText();
        List<String> args = new ArrayList<>();
        if (ctx.listaOrismatwn() != null) {
            for (var expr : ctx.listaOrismatwn().ekfrasi()) {
                args.add(transformExpr(expr.getText()));
            }
        }
        pythonCode.append(indent())
                  .append(funcName).append("(")
                  .append(String.join(", ", args))
                  .append(")\n");
    }

    @Override
    public void enterEisodos(TabloidParser.EisodosContext ctx) {
                // Read user input

        String var = ctx.ID().getText();
        pythonCode.append(indent())
                  .append(var).append(" = input(\"").append(var).append(": \")\n");
    }

    private String convertOperator(String op) {
		        // Map Tabloid operators to Python

        return switch (op) {
            case "PLUS" -> "+";
            case "MINUS" -> "-";
            case "TIMES" -> "*";
            case "DIVIDED BY" -> "/";
            case "MODULO" -> "%";
            case "AND" -> "and";
            case "OR" -> "or";
            case "SMALLER THAN", "LESS THAN" -> "<";
            case "BIGGER THAN", "BEATS" -> ">";
            case "EQUAL TO", "IS ACTUALLY" -> "==";
            case "NOT EQUAL TO" -> "!=";
            default -> op;
        };
    }

    private String transformExpr(String expr) {
		        // Convert a Tabloid expression into Python-friendly form

        expr = expr.replaceAll("(?<=[a-z])(?=[A-Z])", " ");
        expr = expr.replaceAll("(?<=[A-Z])(?=[A-Z][a-z])", " ");
        expr = expr.replaceAll("(?<=[a-zA-Z])(?=[0-9])", " ");
        expr = expr.replaceAll("(?<=[0-9])(?=[a-zA-Z])", " ");
        expr = expr.replaceAll("\\s+", " ");
        // Keyword-to-operator replacements

        expr = expr.replaceAll("\\bTRUE\\b|\\bTOTALLY RIGHT\\b", "True");
        expr = expr.replaceAll("\\bFALSE\\b|\\bCOMPLETELY WRONG\\b", "False");

        expr = expr.replaceAll("\\bSMALLER THAN\\b|\\bLESS THAN\\b", "<");
        expr = expr.replaceAll("\\bBIGGER THAN\\b|\\bBEATS\\b", ">");
        expr = expr.replaceAll("\\bEQUAL TO\\b|\\bIS ACTUALLY\\b", "==");
        expr = expr.replaceAll("\\bNOT EQUAL TO\\b", "!=");
        expr = expr.replaceAll("\\bPLUS\\b", "+");
        expr = expr.replaceAll("\\bMINUS\\b", "-");
        expr = expr.replaceAll("\\bTIMES\\b", "*");
        expr = expr.replaceAll("\\bDIVIDED BY\\b", "/");
        expr = expr.replaceAll("\\bMODULO\\b", "%");
        expr = expr.replaceAll("\\bAND\\b", "and");
        expr = expr.replaceAll("\\bOR\\b", "or");
        // Turn "FUNCTION OF x" into "FUNCTION(x)"

        expr = expr.replaceAll("\\b(\\w+)\\s+OF\\s+([^\\n\\r]+)", "$1($2)");

        return expr.trim();
    }
}

