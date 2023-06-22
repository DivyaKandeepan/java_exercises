package ex1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "first_file.txt";

        try {
            // Create an InputStream to read the file
            InputStream inputStream = new FileInputStream(fileName);

            // Read the content from the file
            StringBuilder content = new StringBuilder();
            int data;
            while ((data = inputStream.read()) != -1) {
                content.append((char) data);
            }

            // Close the InputStream
            inputStream.close();

            // Display the content read from the file
            System.out.println("Content read from the file:");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

