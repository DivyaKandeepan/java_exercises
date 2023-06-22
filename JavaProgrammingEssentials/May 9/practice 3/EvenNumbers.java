import java.util.*;
public class EvenNumbers {
    public static void main(String[] args) 
    {
        System.out.println("The first seven even numbers are:");
        for (int i = 1, count = 0; count < 7; i++) 
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
                count++;
            }
        }
    }
}