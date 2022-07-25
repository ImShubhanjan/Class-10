package ConstructorsExplanation;

class ParameterizedConstructor 
{
    int a, b;

     ParameterizedConstructor(int a, int b) //contructor
     {
        this.a = a;
        this.b = b;
    }

    public void display() //method
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class Main3
{
    public static void main(String[] args) 
    {
        int a = 4;
        int b = 5;
        ParameterizedConstructor obj = new ParameterizedConstructor(a, b);
        obj.display();
    }
}
