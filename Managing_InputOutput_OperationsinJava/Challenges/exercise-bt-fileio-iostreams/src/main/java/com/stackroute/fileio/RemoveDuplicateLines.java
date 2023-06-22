package com.stackroute.fileio;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class RemoveDuplicateLines {
    public void removeDuplicateLines() {
        try {
            Set<String> uniqueLines = new LinkedHashSet<>();

            // Read content from input.txt
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                uniqueLines.add(line.trim()); // Add each line to the set (trimming leading/trailing whitespace)
            }
            reader.close();

            // Write unique lines to output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String uniqueLine : uniqueLines) {
                writer.write(uniqueLine);
                writer.newLine();
            }
            writer.close();

            System.out.println("Output file has been created successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        }

    public static void main(String[] args) {
        RemoveDuplicateLines remover = new RemoveDuplicateLines();
        remover.removeDuplicateLines();
    }
}

