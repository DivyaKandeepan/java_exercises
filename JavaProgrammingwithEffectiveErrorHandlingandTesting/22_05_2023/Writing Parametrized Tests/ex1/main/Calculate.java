public class Calculate {
    public int addSum(int a, int b) {
        return a + b;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Calculate calculator = new Calculate();

        int num1 = 4;
        int num2 = 7;

        // Test addSum method
        int sum = calculator.addSum(num1, num2);
        System.out.println("Sum: " + sum);

        // Check if sum is even
        boolean isSumEven = calculator.isEven(sum);
        System.out.println("Sum is even? " + isSumEven);
    }
}
