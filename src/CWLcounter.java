import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CWLcounter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = console.next();
        int charCount = 0, wordCount = 0 , lineCount = 0;
        File file = new File(fileName);
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (words.length > 0 && !words[0].isEmpty()) {
                    wordCount += words.length;
                }
                lineCount++;
            }
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
