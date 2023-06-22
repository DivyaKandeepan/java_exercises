class EmployeeName {
    private String name;

    public EmployeeName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class EmployeeAge {
    private int age;

    public EmployeeAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class EmployeeId {
    private int id;

    public EmployeeId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class EmployeDetails {
    public static void main(String[] args) {
        EmployeeName empName = new EmployeeName("Divya");
        EmployeeAge empAge = new EmployeeAge(21);
        EmployeeId empId = new EmployeeId(14);

        System.out.println("Name: " + empName.getName());
        System.out.println("Age: " + empAge.getAge());
        System.out.println("ID: " + empId.getId());
    }
}
