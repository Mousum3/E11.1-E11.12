import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloFileHandeler {
    public static void main(String[] args) {
        File inputFile = new File("Hello.txt");
        try (PrintWriter out = new PrintWriter(inputFile)) {
            out.printf("Hello, World!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNextLine()) {
                String value = in.nextLine();
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
