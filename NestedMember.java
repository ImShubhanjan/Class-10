import java.util.Scanner;

class VolumeCalculator
{
    static double rad, height; 
    public static void accept() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        rad = sc.nextDouble();
        System.out.println("Enter the height: ");
        height = sc.nextDouble();
    }
    public static double sphere() 
    {
        double result = (1.33*Math.PI*rad*rad*rad);
        return result;    
    }
    public static double hemisphere() 
    {
        double catcher = sphere();
        double result = catcher / 2;
        return result;
    }
    public static void display()
    {
        double ans1 = sphere();
        System.out.println("The sphere vol is: " + ans1);
        double ans2 = hemisphere();
        System.out.println("The hemisphere vol is: " + ans2);
    }
}


public class NestedMember {
    public static void main(String[] args) {
        VolumeCalculator obj = new VolumeCalculator();
        obj.accept();
        obj.sphere();
        obj.hemisphere();
        obj.display();
    }
}
