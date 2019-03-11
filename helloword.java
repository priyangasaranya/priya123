import java.io.*;
public class helloword
{
    public static void main(String args[])throws Exception 
    {
       // Scanner s=new Scanner(system.in);
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        int n=Integer.parseInt(a);
        for(int i=0;i<n;i++)
        {
            System.out.println("hello");
        }
    }
}
