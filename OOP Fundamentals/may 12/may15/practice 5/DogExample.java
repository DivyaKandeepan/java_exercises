
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class DogExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Nilla");
        System.out.println("name has private access in Dog"); 
    }
}
