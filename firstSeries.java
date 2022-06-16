import java.util.Scanner;

public class firstSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        int ans = findSeriesSum(n);
        System.out.println("\nThe Sum is: " + ans);
    }
    public static int findSeriesSum(int n) 
    {
        int sum = 0;
        System.out.println("The Series is: ");
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(i + " ");
            sum = sum + i;
        }    
        return sum;
    }
}
