    import java.util.*;
    public class ClothesSize {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Size: ");
        String size = scanner.nextLine().toUpperCase();
        scanner.close();
        switch(size){
            case "S" :
                System.out.println("Small");
                break;
            case "M":
                System.out.println("Medium");
                break;
            case "L" :
                System.out.println("Large");
                break;
            case "XL" :
            System.out.println("Extra Large");
            break;
        }
}
}
