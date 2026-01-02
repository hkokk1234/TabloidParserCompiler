# Tabloid Parser & Python Transpiler

A small ANTLR-based toolchain that parses the tabloid-inspired "Tabloid" language and emits runnable Python. Use it to showcase language tooling: a custom grammar, generated parser/lexer, and a listener that translates constructs to clean Python.

## Project Layout
- Grammar: [Tabloid.g4](Tabloid.g4)
- Converter entrypoint: [Tabloid2Python.java](Tabloid2Python.java)
- AST-to-Python listener: [TabloidToPythonListener.java](TabloidToPythonListener.java)
- Generated parser/lexer: [TabloidParser.java](TabloidParser.java), [TabloidLexer.java](TabloidLexer.java) (and companion files)
- Samples: [sample1.tbd](sample1.tbd)–[sample6.tbd](sample6.tbd) with their expected Python outputs

## Quick Start
1. Ensure ANTLR is on the classpath (example uses `antlr-4.13.1-complete.jar`).
2. Compile Java sources:
   ```bash
   javac -cp ".:antlr-4.13.1-complete.jar" Tabloid*.java
   ```
3. Convert a Tabloid program to Python:
   ```bash
   java -cp ".:antlr-4.13.1-complete.jar" Tabloid2Python sample1.tbd
   ```
4. Run the generated Python:
   ```bash
   python3 sample1.py
   ```

## Language Highlights
- Dramatic keywords (e.g., `WHAT IF`, `STAY TUNED WHILE`, `SHOCKING DEVELOPMENT`) mapped to familiar Python control flow.
- Functions with `DISCOVER HOW TO ... WITH ... RUMOR HAS IT ... END OF STORY`.
- Boolean and arithmetic comparisons (`SMALLER THAN`, `BEATS`, `IS ACTUALLY`, etc.) lowered to Python operators.
- Simple input/output helpers (`YOU WON'T WANT TO MISS`, `TELL ME`, `LATEST NEWS ON`).

## Regenerating the Parser
If you tweak [Tabloid.g4](Tabloid.g4), regenerate the lexer and parser:
```bash
antlr4 Tabloid.g4 -visitor -listener
javac -cp ".:antlr-4.13.1-complete.jar" Tabloid*.java
```

## Notes for Portfolio Reviewers
- Samples exercise functions, recursion, conditionals, loops, arithmetic, logic, and user input.
- The transpiler now renders properly spaced Python with accurate operators and else-handling, keeping the generated code readable.
