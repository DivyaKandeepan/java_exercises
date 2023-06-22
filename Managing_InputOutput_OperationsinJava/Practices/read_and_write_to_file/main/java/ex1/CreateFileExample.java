import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        String fileName = "first_file.txt";

        try {
            // Create a new file
            File file = new File(fileName);

            // Check if the file already exists
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                // Create the file
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("File creation failed.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
