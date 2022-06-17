import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) 
        {
            System.out.println();
            System.out.print(i+"+"+(i+1)+"/"+(i+1));
            sum = sum + (i+(i+1)) / (i+1);
        }
        System.out.println("\nThe sum is: " +sum);
    }
}
