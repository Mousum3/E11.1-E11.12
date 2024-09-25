import java.io.*;
//import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BlankRemover {
    public static void main(String[] args) {
        File inputFile;
        Scanner in = null;
        PrintWriter out = null;
        String outputValue="";
        try{
            inputFile = new File("Hello.txt");
            in = new Scanner(inputFile);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        while (in.hasNext()) {
            String value = in.next();
            outputValue += value;
        }

        try{
            inputFile = new File("Hello.txt");
            out = new PrintWriter(inputFile);
            out.printf(outputValue);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        out.close();
        in.close();
    }
}
