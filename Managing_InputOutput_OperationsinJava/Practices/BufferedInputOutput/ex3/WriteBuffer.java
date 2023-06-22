package ex3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBuffer {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String content = "Hello, welcome to StackRoute. Happy learning!";

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName))) {
            byte[] contentBytes = content.getBytes();
            bufferedOutputStream.write(contentBytes);
            System.out.println("Content written to the file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

