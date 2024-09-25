import java.io.*;
//import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RevLineSerial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the input and output file path: ");
        String inputFilePath = console.next();
        String fnl = "";
        String outputFilePath = console.next();
        File inputFile = new File(inputFilePath);
        try (Scanner in = new Scanner(inputFile); PrintWriter out = new PrintWriter(outputFilePath)) {
            while (in.hasNextLine()) {
                String input = in.nextLine();
                fnl = "\n" + input + fnl ;
            }
            out.print(fnl);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
