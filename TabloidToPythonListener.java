import java.util.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
// Listener pou metatrepei Tabloid se Python kwdika

public class TabloidToPythonListener extends TabloidBaseListener {
// Apothikeush ton eksagomenou Python kwdika
    private StringBuilder pythonCode = new StringBuilder();
	 // epipedo kanonikothtas (indentation)
    private int indentLevel = 0;
// Ftiaxnei ta kena analoga me to indentLevel
    private String indent() {
        return "    ".repeat(indentLevel);
    }
// Epistrefei ton teliko Python kwdika ws String
    public String getPythonCode() {
        return pythonCode.toString();
    }

    @Override
    public void enterAnathesi(TabloidParser.AnathesiContext ctx) {
		  // Antistoixei mia anathesi timis se metavliti
        String var = ctx.ID().getText();
        String expr = transformExpr(ctx.ekfrasi().getText());
        pythonCode.append(indent()).append(var).append(" = ").append(expr).append("\n");
    }

    @Override
    public void enterEktypwsi(TabloidParser.EktypwsiContext ctx) {
		        // Antistoixei entolh ektypwsis

        String expr = transformExpr(ctx.ekfrasi().getText());
        pythonCode.append(indent()).append("print(").append(expr).append(")\n");
    }
        // methodos epistrofis apo synartisi

    @Override
    public void enterEpistrofi(TabloidParser.EpistrofiContext ctx) {
		

        if (ctx.ekfrasi() != null) {
            String expr = transformExpr(ctx.ekfrasi().getText());
            pythonCode.append(indent()).append("return ").append(expr).append("\n");
        } else {
            pythonCode.append(indent()).append("return\n");
        }
    }
        //methodos dhmiourgias synarthshs

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
		 // auxhsh to indent gia to swma tis synartisis
    }
// Meiwsh to indent otan teleiwnei h synartisi
    @Override
    public void exitDhmiourgiasynartishs(TabloidParser.DhmiourgiasynartishsContext ctx) {
        indentLevel--;
    }
        // dhmiourgia  entolhs if me synthiki

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
        //methodos dhmiourgias loop while

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
		        // Klhsi synartisis me orismata

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
		        //eisodos xrhsth me input

        String var = ctx.ID().getText();
        pythonCode.append(indent())
                  .append(var).append(" = input(\"").append(var).append(": \")\n");
    }

    private String convertOperator(String op) {
		        //metatroph logikwn kai arithmitikous telestwn

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
		        //metatroph mia Tabloid ekfrashs se Python sumvath morfi

        expr = expr.replaceAll("(?<=[a-z])(?=[A-Z])", " ");
        expr = expr.replaceAll("(?<=[A-Z])(?=[A-Z][a-z])", " ");
        expr = expr.replaceAll("(?<=[a-zA-Z])(?=[0-9])", " ");
        expr = expr.replaceAll("(?<=[0-9])(?=[a-zA-Z])", " ");
        expr = expr.replaceAll("\\s+", " ");
        //metatropi  lexewn se Python

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
        //metatroph "FUNCTION OF x" se "FUNCTION(x)"

        expr = expr.replaceAll("\\b(\\w+)\\s+OF\\s+([^\\n\\r]+)", "$1($2)");

        return expr.trim();
    }
}

