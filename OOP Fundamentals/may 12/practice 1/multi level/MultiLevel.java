
class Base {
    public void printBase() {
        System.out.println("This is the base method.");
    }
}

class Derived1 extends Base {
    public void printDerived1() {
        System.out.println("This is the derived1 method.");
    }
}

class Derived2 extends Derived1 {
    public void printDerived2() {
        System.out.println("This is the derived2 method.");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Base baseObj = new Base();
        baseObj.printBase(); // Output: This is the base method.

        Derived1 derived1Obj = new Derived1();
        derived1Obj.printBase(); // Output: This is the base method.
        derived1Obj.printDerived1(); // Output: This is the derived1 method.

        Derived2 derived2Obj = new Derived2();
        derived2Obj.printBase(); // Output: This is the base method.
        derived2Obj.printDerived1(); // Output: This is the derived1 method.
        derived2Obj.printDerived2(); // Output: This is the derived2 method.
    }
}
