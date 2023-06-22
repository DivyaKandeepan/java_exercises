public class ObjectCounter {
    private static int counter = 0; // static variable to count objects
    private int objectId; // instance variable for each object

    public ObjectCounter() {
        counter++; 
        objectId = counter; // assign the counter value to the objectId
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        System.out.println("Number of objects created: " + counter);

        System.out.println("Object 1 ID: " + obj1.objectId);
        System.out.println("Object 2 ID: " + obj2.objectId);
        System.out.println("Object 3 ID: " + obj3.objectId);
    }
}
