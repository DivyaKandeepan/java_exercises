public class UncheckedException {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception ex) {
            System.out.println("Caught exception: " + ex);
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        int[] arr = {1, 2, 3};

        // Trying to access an index that is out of bounds
        int element = arr[5]; // This will throw an ArrayIndexOutOfBoundsException
    }
}
