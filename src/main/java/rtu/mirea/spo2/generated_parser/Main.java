package rtu.mirea.spo2.generated_parser;

import com.sun.source.tree.CompilationUnitTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Чтение файла с исходным кодом
        StringBuilder sb = new StringBuilder();
        try(FileReader reader = new FileReader("input_code.txt"))
        {
            int c;
            while((c = reader.read()) != -1) {
                sb.append((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String source = sb.toString();

//        ChristianCLexer lexer = new ChristianCLexer(CharStreams.fromString(source));
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        ChristianCParser parser = new ChristianCParser(tokens);
////        ParseTree tree = parser.compilat3ionUnit();
//        System.out.println(parser.compileParseTreePattern());

        ChristianCLexer lexer = new ChristianCLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ChristianCParser parser = new ChristianCParser(tokens);
        ParseTree tree = parser.lang();
    }
}
