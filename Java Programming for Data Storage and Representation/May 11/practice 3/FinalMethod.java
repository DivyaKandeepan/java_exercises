public class FinalMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessage();
    } 
    
    
}

class Parent {
    public final void displayMessage() {
        System.out.println("This is a final method in the Parent class.");
    }
}

class Child extends Parent {
    // Attempting to override the final method will result in a compilation error
    // public void displayMessage() {
    //     System.out.println("This is an overridden method in the Child class.");
     
}
