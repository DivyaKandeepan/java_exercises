class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("The " + type + " starts.");
    }

    public void stop() {
        System.out.println("The " + type + " stops.");
    }
}

class Car extends Vehicle {
    public Car() {
        super("Car");
    }

    public void changeGear() {
        System.out.println("Changing gears of the car.");
    }
}

class SportsCar extends Car {
    private int speed;

    public SportsCar() {
        super();
        speed = 0;
    }

    public void increaseSpeed(int increment) {
        speed += increment;
        System.out.println("Speed increased to " + speed + " km/h.");
    }

    public void decreaseSpeed(int decrement) {
        speed -= decrement;
        System.out.println("Speed decreased to " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.changeGear();
        sportsCar.increaseSpeed(30);
        sportsCar.decreaseSpeed(10);
        sportsCar.stop();
    }
}
