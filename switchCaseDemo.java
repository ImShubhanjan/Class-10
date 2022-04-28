import java.util.*;

public class switchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        switch(n)
        {
            case 1:
            {
                System.out.println("Jan");
                break;
            }
            case 2:
            {
                System.out.println("Feb");
                break;
            }
            case 3:
            {
                System.out.println("Mar");
                break;
            }
            default:
            {
                System.out.println("Wrong Input");
            }
        }
    }
}
