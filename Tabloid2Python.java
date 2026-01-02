import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;

public class Tabloid2Python {
    public static void main(String[] args) {
        if (args.length != 1 || !args[0].endsWith(".tbd")) {
            System.err.println("Usage: java Tabloid2Python <file.tbd>");
            return;
        }

        String inputFile = args[0];
        String outputFile = inputFile.replace(".tbd", ".py");

        try {
            // Read source file as text
            String code = Files.readString(Paths.get(inputFile));

            // Insert spaces where tokens may be glued together
            code = code.replaceAll("(?<=[a-z])(?=[A-Z])", " ");
            code = code.replaceAll("(?<=[A-Z])(?=[A-Z][a-z])", " ");
            code = code.replaceAll("(?<=[a-zA-Z])(?=[0-9])", " ");
            code = code.replaceAll("(?<=[0-9])(?=[a-zA-Z])", " ");

            CharStream input = CharStreams.fromString(code);
            TabloidLexer lexer = new TabloidLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TabloidParser parser = new TabloidParser(tokens);

            // Surface parser diagnostics
            parser.removeErrorListeners();
            parser.addErrorListener(new DiagnosticErrorListener());

            // Parse using grammar entry rule "programma"
            ParseTree tree = parser.programma();
            // Listener that emits Python
            TabloidToPythonListener listener = new TabloidToPythonListener();
            ParseTreeWalker.DEFAULT.walk(listener, tree);
            // Export generated Python
            String pythonCode = listener.getPythonCode();
            // Write the converted file
            Files.writeString(Paths.get(outputFile), pythonCode);
            System.out.println("Conversion completed: " + outputFile);

        } catch (IOException e) {
            // File read/write problem
            System.err.println("File error: " + e.getMessage());
        } catch (Exception e) {
            // Generic parse/convert problem
            System.err.println("Error during parsing or conversion: " + e.getMessage());
        }
    }
}
