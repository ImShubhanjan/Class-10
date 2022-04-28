public class Operators {
    public static void main(String[] args) {
        int x=2, y=6,z=10;
        int p = --x + y + x-- + z-- + --y + x--; //unary
        // System.out.println(p);

        int a = 5*6; //binary

        int t = (a == 11)?1:0; //ternary
        //converting to if-else 
        if(a == 11) 
        {
            System.out.println("1");  //t=1
        }
        else
        {
            System.out.println("0");   //t=0
        }
        // System.out.println(t);
    }
}
