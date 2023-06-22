class OuterClass {
    static class InnerClass {
        public static void innerMethod() {
            System.out.println("Inner method called");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass.innerMethod();
    }
}
