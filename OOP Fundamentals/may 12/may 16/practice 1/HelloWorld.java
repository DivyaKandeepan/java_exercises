

public class HelloWorld {
    public static void main(String[] args) {
        String text = "Hello World";
        Class<?> className = text.getClass();
        System.out.println("Class Name: " + className);
    }
}
