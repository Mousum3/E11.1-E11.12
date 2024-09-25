import java.io.*;
//import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RevFile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the input file path: ");
        String inputFilePath = console.next();
        String fnl = "";
        File inputFile = new File(inputFilePath);
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String input = in.nextLine();
                StringBuilder input1 = new StringBuilder();
                input1.append(input);
                input1.reverse();
                fnl += input1 + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try(PrintWriter out = new PrintWriter(inputFile)){
            out.printf("%s",fnl);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
