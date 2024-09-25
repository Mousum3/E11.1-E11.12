import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumberedOutputArgument {
    public static void main(String[] args) {
        String input, output;
        if (args.length == 2) {
            input = args[0];
            output = args[1];
        } else {
            System.out.print("Enter input and output path: ");
            Scanner con = new Scanner(System.in);
            input = con.nextLine();
            output = con.nextLine();
        }
        try (Scanner in = new Scanner(new File(input)); PrintWriter out = new PrintWriter(output)) {
            int i = 1;
            while (in.hasNextLine()) {
                String value = in.nextLine();
                out.printf("/* %d */ %s%n", i++, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
