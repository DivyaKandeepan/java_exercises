package ex2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteRead {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\divya\\OneDrive\\Desktop\\CGI_Training_JAVA\\target\\classes\\input.txt";

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {
            int availableBytes = bufferedInputStream.available();
            System.out.println("Number of bytes available in the input stream: " + availableBytes);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

