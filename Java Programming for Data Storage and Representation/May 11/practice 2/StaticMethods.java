
    class Math {
        public static int add(int a, int b) {
            return a + b;
        }
    
        public static int subtract(int a, int b) {
            return a - b;
        }
    }
    
    public class StaticMethods {
        public static void main(String[] args) {
            int result1 = Math.add(5, 3);
            System.out.println("Addition: " + result1); // Output: 8
    
            int result2 = Math.subtract(10, 4);
            System.out.println("Subtraction: " + result2); // Output: 6
        }
    }
    
