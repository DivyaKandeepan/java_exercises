public class Product{
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static double multiply(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        System.out.println("Multiply (4, 5): " + multiply(4, 5));
        System.out.println("Multiply (2, 2, 3): " + multiply(2, 2, 3));
        System.out.println("Multiply (1.0, 2.0, 3.0): " + multiply(1.0, 2.0, 3.0));
    }
}
