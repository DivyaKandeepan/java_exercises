interface Calculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calculator sumCalculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        int sum = sumCalculator.calculate(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
