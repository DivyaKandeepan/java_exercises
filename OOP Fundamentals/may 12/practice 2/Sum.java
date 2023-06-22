public class Sum {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("Sum (10, 20): " + sum(10, 20));
        System.out.println("Sum (10, 20, 30): " + sum(10, 20, 30));
        System.out.println("Sum (10.5, 20.5): " + sum(10.5, 20.5));
    }
}

