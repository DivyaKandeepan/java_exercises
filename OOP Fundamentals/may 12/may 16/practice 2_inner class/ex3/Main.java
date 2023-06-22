class OuterClass {
    private int num1;

    public OuterClass(int num1) {
        this.num1 = num1;
    }

    class InnerClass {
        private int num2;

        public InnerClass(int num2) {
            this.num2 = num2;
        }

        public void calculateProduct() {
            int product = num1 * num2;
            System.out.println("Product: " + product);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass(5);
        OuterClass.InnerClass innerObj = outerObj.new InnerClass(10);

        innerObj.calculateProduct();
    }
}
