class Base {
    public void printBase() {
        System.out.println("This is the base method.");
    }
}

class Derived extends Base {
    public void printDerived() {
        System.out.println("This is the derived method.");
    }
}

public class SingleInheritence {
    public static void main(String[] args) {
        Base baseObj = new Base();
        baseObj.printBase(); // Output: This is the base method.

        Derived derivedObj = new Derived();
        derivedObj.printBase(); // Output: This is the base method.
        derivedObj.printDerived(); // Output: This is the derived method.
    }
}
