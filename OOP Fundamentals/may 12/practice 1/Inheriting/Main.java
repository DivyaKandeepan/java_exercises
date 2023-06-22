class Person {
    public int personId;
    public String personName;

    public Person(int id, String name) {
        personId = id;
        personName = name;
    }

    public void displayPerson() {
        System.out.println("Person ID: " + personId);
        System.out.println("Person Name: " + personName);
    }
}

class Student extends Person {
    public int studentAge;

    public Student(int id, String name, int age) {
        super(id, name);
        studentAge = age;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + super.personId);
        System.out.println("Student Name: " + super.personName);
        System.out.println("Student Age: " + studentAge);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "James Adam", 22);
        student.displayPerson();
        System.out.println(); // Blank line for separation
        student.displayStudent();
    }
}
