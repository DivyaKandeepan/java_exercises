import java.util.Scanner;
public class OddOrEven {
    void find(){

        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        scanner.close();

        if (number%2==0) {

            System.out.println(number +" is an Even Number");
            
        } else {
            System.out.println(number +" is an Odd Number");
            
        }
    }
    public static void main(String[]args){
        OddOrEven o = new OddOrEven();
        o.find();

    }
    
}
