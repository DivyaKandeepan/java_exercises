class ElectronicGoods {
    public void run() {
        System.out.println("Electronic Goods are running smoothly");
    }
}

class Laptop extends ElectronicGoods {
    @Override
    public void run() {
        System.out.println("Laptop is running smoothly");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectronicGoods electronicGoods = new ElectronicGoods();
        electronicGoods.run(); // Output: "Electronic Goods are running smoothly"

        Laptop laptop = new Laptop();
        laptop.run(); // Output: "Laptop is running smoothly"
    }
}
