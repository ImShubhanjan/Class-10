
public class returnMagic {
    public static void main(String[] args) {
        int a = 10, b = 16;
        int c = sum(a,b);
        System.out.println(c);
    }
    public static int sum(int a, int b) {
        int n = a+b;
        System.out.println("R");
        System.out.println("D");
        System.out.println("S");
        return n;
    }
}
