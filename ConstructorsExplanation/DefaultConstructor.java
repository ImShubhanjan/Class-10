package ConstructorsExplanation;

class DefaultConstructor 
{
    boolean a,b;
    public DefaultConstructor()
    {
        System.out.println("in Cons");
    }

    public void display() 
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class Main {
    public static void main(String[] args) 
    {
        DefaultConstructor obj = new DefaultConstructor();
        obj.display();    
    }
}
