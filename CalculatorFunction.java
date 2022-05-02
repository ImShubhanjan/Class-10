import java.util.*;

public class CalculatorFunction 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        int acceptedValueForAdd = add(a, b);
        int acceptedValueForSubstract = substract(a, b);
        int acceptedValueForMultiply = multiply(a, b);
        double acceptedValueForDivide = divide(a, b);

        System.out.println("Add: " + acceptedValueForAdd);
        System.out.println("Substract: " + acceptedValueForSubstract);
        System.out.println("Multiply: " + acceptedValueForMultiply);
        System.out.println("Divide: " + acceptedValueForDivide);

    }

    public static int add(int a, int b) 
    {
        int calculatedValue = a + b;
        return calculatedValue;
    }
    public static int substract(int a, int b) 
    {
        int calculatedValue = a - b;
        return calculatedValue;
    }
    public static int multiply(int a, int b) 
    {
        int calculatedValue = a * b;
        return calculatedValue;
    }
    public static double divide(int a, int b) 
    {
        double calculatedValue = (double) a / b;
        return calculatedValue;
    }
}