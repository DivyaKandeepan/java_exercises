import java.io.*;
//checkExecption

public class CheckedException {
    public static void main(String[] args) {
        try {
            method1();
        } catch (IOException ex) {
            System.out.println("Caught exception: " + ex);
        }
    }

    public static void method1() throws IOException {
        method2();
    }

    public static void method2() throws IOException {
        FileReader fileReader = new FileReader("nofile.txt"); // This will throw a FileNotFoundException
    }
}
