import java.util.Scanner;

public class CalculatorNonStatic {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        CalculatorNonStatic object = new CalculatorNonStatic();

        int acceptedValueForAdd = object.add(a, b);
        int acceptedValueForSubstract = object.substract(a, b);
        int acceptedValueForMultiply = object.multiply(a, b);
        double acceptedValueForDivide = object.divide(a, b);

        System.out.println("Add: " + acceptedValueForAdd);
        System.out.println("Substract: " + acceptedValueForSubstract);
        System.out.println("Multiply: " + acceptedValueForMultiply);
        System.out.println("Divide: " + acceptedValueForDivide);

    }

    public int add(int a, int b) 
    {
        int calculatedValue = a + b;
        return calculatedValue;
    }
    public int substract(int a, int b) 
    {
        int calculatedValue = a - b;
        return calculatedValue;
    }
    public int multiply(int a, int b) 
    {
        int calculatedValue = a * b;
        return calculatedValue;
    }
    public double divide(int a, int b) 
    {
        double calculatedValue = (double) a / b;
        return calculatedValue;
    }
}