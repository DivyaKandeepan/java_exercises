package ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteFile {
    public static void main(String[] args) {
        String fileName = "first_file.txt";
        String content = "Hi, welcome again......!";

        try {
            // Create an OutputStream to write to the file
            OutputStream outputStream = new FileOutputStream(fileName, true);

            // Convert the content string to bytes
            byte[] contentBytes = content.getBytes();

            // Write the content to the file
            outputStream.write(contentBytes);

            // Close the OutputStream
            outputStream.close();

            System.out.println("Content written to the file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
