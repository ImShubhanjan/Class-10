package ConstructorsExplanation;

public class NonParameterzied 
{
    int a,b,c;
    public NonParameterzied()
    {
        a=5;
        b=7;
        c=13;
    }
    public void display() 
    {
        System.out.println("a = "+a);    
        System.out.println("b = "+b);    
        System.out.println("c = "+c);    
    }    
}

class Main2 
{
    public static void main(String[] args) 
    {
        NonParameterzied obj = new NonParameterzied();
        obj.display();
    }
}
