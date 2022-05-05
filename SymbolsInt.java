import java.util.*;

public class SymbolsInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int answer = Check(n);

        if(answer == -1) 
        {
            System.out.println("Negative");
        }
        else if(answer == 1) 
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Equal");
        }
    }
    public static int Check(int n) 
    {
        if(n < 0) 
        {
            return -1;
        }
        else if(n > 0) 
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
}
