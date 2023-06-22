
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class PrivateDataMember {
    public static void main(String[] args) {
        Dog dog = new Dog("dalmation");
        System.out.println(dog.getName()); // Output: Buddy
    }
}
