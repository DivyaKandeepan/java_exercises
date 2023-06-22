package ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        String fileName = "first_file.txt";
        String content = "Hello, world!";

        try {
            // Create a new file
            File file = new File(fileName);

            // Check if the file already exists
            if (file.exists()) {
                // Create the file
                boolean created = file.createNewFile();
                if (file.exists()) {
                    System.out.println("File created successfully.");

                    // Write content to the file
                    FileWriter writer = new FileWriter(file);
                    writer.write(content);
                    writer.close();

                    System.out.println("Content successfully written to the file.");
                } else {
                    System.out.println("File creation failed.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

