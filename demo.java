
public class demo {
    public static void main(String[] args) {
        
        for (String string : args) {
            System.out.println(string);
        }
    }
    public static void pass() {
        String[] a = {"Hello", "Hi"};
        main(a);
    }
}
