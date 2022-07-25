import java.util.Scanner;

class Compute {
    static int phy, chem, bio, avg;
    static String name;
    static char grade;

    public static void accept() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the marks in physics: ");
        phy = sc.nextInt();
        System.out.println("Enter the marks in chemistry: ");
        chem = sc.nextInt();
        System.out.println("Enter the marks in biology: ");
        bio = sc.nextInt();
    }

    public static void average() 
    {   
        avg = (phy + chem + bio) / 3;
        if(avg <= 100 && avg >= 90) 
        {
            grade = 'A';
        }
        if(avg < 90 && avg >= 80) 
        {
            grade = 'B';
        }
        if(avg < 80 && avg >= 70) 
        {
            grade = 'C';
        }
        if(avg < 70 && avg >= 60) 
        {
            grade = 'D';
        }
        else 
        {
            grade = 'F';
        }
    }
    public static void display() 
    {
        System.out.print("Name\t\tAverage\t\tGrade");
        System.out.println();
        System.out.print(name+"\t\t"+avg+"\t\t"+grade);    
    }
}

public class Result 
{
    public static void main(String[] args) {
        Compute obj = new Compute();
        obj.accept();
        obj.average();
        obj.display();
    }
}
