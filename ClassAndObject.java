
public class ClassAndObject {
 public static void main(String[] args) {
        System.out.println("In main");

        // A objA = new A(); // without static keyword
        // B objB = new B();
        // objA.printA();
        // objB.printB();

        A.printA(); //with static keyword
        A.printA2();
        B.printB();
    }
}
class A 
{
    public static void printA()
     {
      System.out.println("In A");  
    }
    public static void printA2() 
    {
        System.out.println("In A 2");    
    }
}

class B 
{
    public static void printB() 
    {
        System.out.println("In B");    
    }
}
