package ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "first_file.txt";

        try {
            // Create a FileReader to read the file
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            // Read the content from the file
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }

            // Close the FileReader and BufferedReader
            reader.close();
            fileReader.close();

            // Display the content read from the file
            System.out.println("Content read from the file:");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

