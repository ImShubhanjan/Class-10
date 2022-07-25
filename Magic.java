import java.util.Scanner;

public class Magic 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int n = sc.nextInt();

         checkMagic(n);
    }

    public static void checkMagic(int n) 
    {
        int res = sumDigits(n);
        int flag = 0;
        while(res <= 1 || res > 9)
        {
            if(res == 1)
            {
                flag = 1;
                break;
            }
            else 
            {
                res = sumDigits(res);
            }
        }
        if(flag == 1) 
        {
            System.out.println("Magic number");
        }
        else
        {
            System.out.println("Not a magic number");
        }
    }
    public static int sumDigits(int n) 
    {
        int rem = 0, sum = 0;
        while(n > 0) 
        {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;    
    }
}
