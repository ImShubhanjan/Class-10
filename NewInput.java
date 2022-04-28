import java.io.*;

public class NewInput {
    public static void main(String[] args) 
    {
        int n=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        try {
         n = Integer.parseInt(br.readLine());
        }
        catch(IOException e) {
            System.out.println("Please give a number");
        }
     
        System.out.println(n);
    }
}
