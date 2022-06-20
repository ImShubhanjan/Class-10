import java.util.Scanner;

class Operation
{
    static int a, b, sumab, diffab, c=6; //global variable

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
        int c = 5;  //local variable
        System.out.println(c);
    }

    public static void display() 
    {
        System.out.println("The Sum of a and b: " + sumab);
        System.out.println("The diff of a and b: " + diffab);
        System.out.println(c);

    }
    public static void mango() 
    {
        System.out.println("mango");
        System.out.println(a);
        System.out.println(b);
        System.out.println(sumab);
        System.out.println(diffab);
    }
}

public class Sample
{
    public static void main(String[] args) {
        // Operation obj = new Operation();
        Operation.accept();
        Operation.calculate();
        Operation.display();
    }
}
