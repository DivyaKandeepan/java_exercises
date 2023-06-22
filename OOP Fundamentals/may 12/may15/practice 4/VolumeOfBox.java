class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }
}

class Display {
    public static void displayVolume(double volume) {
        System.out.println("Volume: " + volume);
    }
}

public class VolumeOfBox {
    public static void main(String[] args) {
        double length = 4.0;
        double width = 6.0;
        double height = 12.0;

        Box box = new Box(length, width, height);
        double volume = box.getVolume();
        Display.displayVolume(volume);
    }
}
