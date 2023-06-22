class Multiply {
    public static int multiplyThreeNumbers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
}

class Result {
    public static void displayResult(int result) {
        System.out.println("Result: " + result);
    }
}

public class Product {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 2;
        int num3 = 4;

        int result = Multiply.multiplyThreeNumbers(num1, num2, num3);
        Result.displayResult(result);
    }
}
