import java.util.*;
public class EqualUnequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) 
        {
            int a1 = (int) Math.pow(a,3);
            int b1 = (int) Math.pow(b,2);
            System.out.println("Small: " + b1);
            System.out.println("Large: " + a1);
        }
        else if(b > a) 
        {
            int b1 = (int) Math.pow(b, 3);
            int a1 = (int) Math.pow(a,2);
            System.out.println("Small: " + a1);
            System.out.println("Large: " + b1);
        }
        else 
        {
            System.out.println("Both numbers are equal");
        }
    }
}
