import java.util.Scanner;

public class factUsingFunc {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int factorial = calculateFactorial(n);
        System.out.println("The factorial is: " + factorial);
    }

    public static int calculateFactorial(int n) 
    {
        int fact = 1;
        for (int i = 1; i <= n; i++) 
        {
            fact = fact * i;
        }
        return fact;
    }
}
