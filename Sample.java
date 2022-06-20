import java.util.Scanner;

class Operation
{
    static int a, b, sumab, diffab;

    public static void accept() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd: ");
        b = sc.nextInt();
    }

    public static void calculate() 
    {
        sumab = a + b;
        diffab = a - b;
    }

    public static void display() 
    {
        System.out.println("The Sum of a and b: " + sumab);
        System.out.println("The diff of a and b: " + diffab);
    }
}

public class Sample
{
    public static void main(String[] args) {
        Operation obj = new Operation();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
