class OuterClass {
    private int num1;
    private int num2;

    public OuterClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    class InnerClass {
        public void calculateSum() {
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass(10, 20);
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        innerObj.calculateSum();
    }
}
