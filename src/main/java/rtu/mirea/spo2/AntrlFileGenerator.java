package rtu.mirea.spo2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class AntrlFileGenerator {
    public static void generateAntlrFile(ArrayList<Pair<Pair<String, String>, ArrayList<Pair<String, String>>>> productions, HashSet<Pair<String, String>> fragrments){
        final String dir = System.getProperty("user.dir");
        System.out.println(dir);
        try(FileWriter writer = new FileWriter(dir + "\\src\\main\\antlr4\\church_lang.txt", false)){
            for(var production : productions){
                if(fragrments.contains(production.getFirst())){
                    writer.write("fragment ");
                }
                writer.write(production.getFirst().getSecond() + " : ");
                for(var term : production.getSecond()){
                    if(term.getFirst().equals("TERMINAL") && isRegEx(term.getSecond())){
                        writer.write(term.getSecond().substring(0, term.getSecond().length()-2) + " ");
                    }
                    else{
                        writer.write(term.getSecond() + " ");
                    }
                }
                writer.write(";\n");
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public static boolean isRegEx(String s)
    {
        if(s.charAt(0) == '\'' && s.charAt(s.length() - 1) == '\'' && s.charAt(1) == '^' && s.charAt(s.length() - 2) == '$')
            return true;
        return false;
    }
}
