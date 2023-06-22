import java.util.*;
public class Remarks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        String grade = scanner.nextLine().toUpperCase();
        scanner.close();
        switch(grade){
            case "A" :
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C" :
                System.out.println("Average");
                break;
            case "D" :
            System.out.println("Poor");
            break;
        }

    }
}
