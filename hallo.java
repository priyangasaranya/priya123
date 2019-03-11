import java.io.*;
public class helloworld
{
    public static void main(String args[])throws Exception 
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        int n=Integer.parseInt(a);
        for(int i=0;i<n;i++)
        {
            System.out.println("hello");
        }
    }
}

