

public class Clone {
    public static void main(String[] args) {
        MainClass obj1 = new MainClass("Hello");

        try {
            MainClass obj2 = (MainClass) obj1.clone();
            obj2.setVariable("world");

            System.out.println("obj1 variable: " + obj1.getVariable());
            System.out.println("obj2 variable: " + obj2.getVariable());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
class MainClass implements Cloneable {
    private String variable;

    public MainClass(String variable) {
        this.variable = variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
