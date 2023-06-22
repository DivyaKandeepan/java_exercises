abstract class MyAbstractClass {
    abstract void myAbstractMethod(); // Abstract method declaration
    
    void myMethod() {
        System.out.println("Executing myMethod in abstract class");
    }
}

class MyConcreteClass extends MyAbstractClass {
    @Override
    void myAbstractMethod() {
        System.out.println("Executing myAbstractMethod in concrete class");
    }
}

public class Main {
    public static void main(String[] args) {
        MyAbstractClass myInstance = new MyConcreteClass(); // Instantiate concrete class
        
        myInstance.myAbstractMethod(); // Call abstract method
        myInstance.myMethod(); // Call non-abstract method
    }
}
