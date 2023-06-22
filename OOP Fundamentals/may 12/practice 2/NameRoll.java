public class NameRoll {
    public static void studentId(String name, int rollNo) {
        System.out.println("Name: " + name + "   Roll-No: " + rollNo);
    }

    public static void studentId(int rollNo, String name) {
        System.out.println("Roll-No: " + rollNo + "   Name: " + name);
    }

    public static void main(String[] args) {
        studentId("Raj", 5);
        studentId(1, "Abhi");
    }
}
