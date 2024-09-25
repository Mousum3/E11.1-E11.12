import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the input file path: ");
        String inputFilePath = console.next();
        File inputFile = new File(inputFilePath);

        try (Scanner in = new Scanner(inputFile)) {
            int rowNumber = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (line.isEmpty()) {
                    System.out.printf("Row %d average: 0.000000%n", rowNumber);
                } else {
                    String[] numbers = line.split("\\s+");
                    double total = 0;
                    int count = 0;
                    for (String numStr : numbers) {
                        try {
                            double number = Double.parseDouble(numStr);
                            total += number;
                            count++;
                        } catch (NumberFormatException e) {
                            System.out.printf("Invalid number in row %d: '%s'%n", rowNumber, numStr);
                        }
                    }
                    double average = (count > 0) ? total / count : 0;
                    System.out.printf("Row %d average: %.6f%n", rowNumber, average);
                }
                rowNumber++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFilePath);
        }
    }
}
