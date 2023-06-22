interface MyInterface {
    int myVariable = 10; // Initialization of the variable
    
    void display(); // Declaration of the function
}

class MyCreatorClass implements MyInterface {
    @Override
    public void display() {
        System.out.println("Value of myVariable: " + myVariable);
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = new MyCreatorClass() {
            @Override
            public void display() {
                System.out.println("Modified value of myVariable: " + myVariable);
            }
        };
        
        myInterface.display();
    }
}
