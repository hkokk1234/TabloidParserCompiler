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
            //diavasma arxeiou ws keimeno
            String code = Files.readString(Paths.get(inputFile));

            //diorthosh kollhmenwn lexewn
            code = code.replaceAll("(?<=[a-z])(?=[A-Z])", " ");
            code = code.replaceAll("(?<=[A-Z])(?=[A-Z][a-z])", " ");
            code = code.replaceAll("(?<=[a-zA-Z])(?=[0-9])", " ");
            code = code.replaceAll("(?<=[0-9])(?=[a-zA-Z])", " ");

            CharStream input = CharStreams.fromString(code);
            TabloidLexer lexer = new TabloidLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TabloidParser parser = new TabloidParser(tokens);

            //entopismos lathwn kata th syntaksh
            parser.removeErrorListeners();
            parser.addErrorListener(new DiagnosticErrorListener());

//parsing me vash ton kanona "programma"
            ParseTree tree = parser.programma();
//dhmiourgia tou listener pou metatrepei Tabloid se Python
            TabloidToPythonListener listener = new TabloidToPythonListener();
            ParseTreeWalker.DEFAULT.walk(listener, tree);
//eksagwgh kwdika se python
            String pythonCode = listener.getPythonCode();
//epityshs metatroph arxeiou
            Files.writeString(Paths.get(outputFile), pythonCode);
            System.out.println("Conversion completed: " + outputFile);

        } catch (IOException e) {
			//lathos kata to diavasma/eggrafi arxeiou
            System.err.println("File error: " + e.getMessage());
        } catch (Exception e) {
			//geniko lathos kata to parsing i tin metatropi
            System.err.println("Error during parsing or conversion: " + e.getMessage());
        }
    }
}
