import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        findLCM(n1, n2);
    }
    public static void findLCM(int n1, int n2) 
    {
        int lcm = 0, ans = 0;
        if(n1 > n2)
        {
            lcm = n1;
        }
        else
        {
            lcm = n2;
        }
        while(true) 
        {
            if(lcm%n1 == 0 && lcm%n2 ==0) 
            {
                ans = lcm;
                break;
            }
            lcm++;
        }
        System.out.println("The LCM of " + n1 + " and " +n2+ " is " + ans);
    }
}
