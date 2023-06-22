class SuperCls {
    public SuperCls() {
        System.out.println("Inside the superclass constructor.");
    }
}

class ChildClass extends SuperCls {
    public ChildClass() {
        super(); // Calling the superclass constructor
        System.out.println("Inside the child class constructor.");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
    }
}