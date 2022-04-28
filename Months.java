import java.util.*;
public class Months
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n == 1) 
        {
            System.out.println("Jan");
        }
        else if(n == 2)
        {
            System.out.println("Feb");
        }
        else if(n == 3) 
        {
            System.out.println("Mar");
        }
        else 
        {
            System.out.println("some other month");
        }
    }
}