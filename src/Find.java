import java.io.*;
import java.util.Scanner;

public class Find {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Format: java Find <word> <file1> <file2> ...");
            return;
        }

        String wordToFind = args[0];

        for (int i = 1; i < args.length; i++) {
            String fileName = args[i];
            searchWordInFile(wordToFind, fileName);
        }
    }

    public static void searchWordInFile(String word, String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int lineNumber = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(word)) {
                    System.out.println(fileName + " (line " + lineNumber + "): " + line);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
