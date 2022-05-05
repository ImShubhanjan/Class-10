import java.util.*;

public class symbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String answer = Check(n);
        System.out.println(answer);
    }

    public static String Check(int n)
    {
        if(n > 0) 
        {
            return "Positive";
        }
        else if(n < 0)
        {
            return "Negative";
        }
        else 
        {
            return "Equal";
        }
    }
}
