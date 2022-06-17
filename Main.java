import java.util.Scanner;

class Calculate //this is a seprate class where calculations are done. 
{
    public static void Grade(int Phy, int Chem, int Bio)
    {
        int average = (Phy + Chem + Bio) / 3;
        System.out.println("Average Marks: " + average);

        if(average <= 100 && average > 90)
        {
            System.out.println("Grade - A");
        }
        else if(average <= 90 && average > 80) 
        {
            System.out.println("Grade - B");
        }
        else if(average <= 80 && average > 70) 
        {
            System.out.println("Grade - C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

public class Main //this is a seprate class where values are passed.
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks in Physics: ");
        int Phy = sc.nextInt();
        System.out.println("Enter the Marks in Chemistry: ");
        int Chem = sc.nextInt();
        System.out.println("Enter the Marks in Biology: ");
        int Bio = sc.nextInt();

        System.out.println("Marks: ");
        System.out.println("Physics: " + Phy);
        System.out.println("Chemistry: " + Chem);
        System.out.println("Biology: " + Bio);

        Calculate obj = new Calculate();  //This way object is created 
        obj.Grade(Phy, Chem, Bio);
        
    }    
}
