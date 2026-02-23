package Day_28;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileWordCounter {
    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter file name: ");
            String fileName = consoleReader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

            String line;
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
            while ((line = fileReader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }
            fileReader.close();
            System.out.println("\nFile Analysis:");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}