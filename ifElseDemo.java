
import java.util.*;
public class ifElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n == 10)
        {
            System.out.println("Yes 10"); //if-else ladder
        }
        else if(n == 9) 
        {
            System.out.println("Yes 9");
        }
        else if(n == 8) 
        {
            System.out.println("Yes 8");
        }

        else 
        {
            System.out.println("No");
        }
    }
}
