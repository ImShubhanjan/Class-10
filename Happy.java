import java.util.Scanner;

public class Happy 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        checkHappy(n);
    }

    public static void checkHappy(int n) 
    {
        int flag = 0;
        int res = squSumOfDigits(n);
        while(res <= 1 || res > 9)
        {
            if(res == 1 || res == 7)
            {
                flag = 1;
                break;
            }
            else 
            {
                res = squSumOfDigits(res);
            }
        }
        if(flag == 1)
        {
            System.out.println("Happy Number");
        }
        else 
        {
          System.out.println("Not a happy number");
        }
    }
    public static int squSumOfDigits(int n)
    {
        int rem = 0, sum = 0;
        while(n > 0) 
        {
            rem = n % 10;
            sum = sum + rem*rem;
            n = n / 10;
        }
        return sum;
    }
}
