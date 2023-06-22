class Area {
    public void rectArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void sqArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

public class AreaOfRecAndSq {
    public static void main(String[] args) {
        Area areaObj = new Area();
        areaObj.rectArea(2, 4);
        areaObj.sqArea(6);
    }
}
