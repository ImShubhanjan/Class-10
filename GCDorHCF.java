import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        findGCD(n1, n2);
    }

    public static void findGCD(int n1, int n2) {
        int gcd = 0;
        for (int i = 1; i <= n1 && i <= n2; i++)
         {
            if (n1 % i == 0 && n2 % i == 0) 
            {
                gcd = i;
            }
        }
        System.out.println("The GCD of " + n1 + " and " +n2+ " is " + gcd);
    }
}
