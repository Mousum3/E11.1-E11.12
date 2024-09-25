import java.io.*;
//import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CollumSum {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.print("Enter input and output path: ");
        String input = con.next(), output = con.next();
        double total1 = 0, total2 = 0;
        File inputFile = new File(input);
        int i = 0;
        try (Scanner in = new Scanner(inputFile); PrintWriter out = new PrintWriter(output)) {
            while (in.hasNextDouble()) {      //Assuming that there are equal number of rows
                i++;
                total1 += in.nextDouble();
                total2 += in.nextDouble();
            }
            out.printf("%f  %f",total1/i,total2/i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
