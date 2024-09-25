import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumberedOutput {
    public static void main(String[] args) {
        File inputFile = new File("Hello.txt");
        int i = 1;
        try (Scanner in = new Scanner(inputFile); PrintWriter out = new PrintWriter("out.txt")) {
            while (in.hasNextLine()) {
                String value = in.nextLine();
                out.printf("/* %d */ %s%n", i++, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
