import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        boolean flag=false;
        if(y%400==0)
        {
            flag=true;
        }
        else if(y%100==0)
        {
            flag=false;
        }
        else if(y%4==0)
        {
            flag=true;
        }
        else
        {
            flag=false;
        }
        if(flag)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO" );
        }
    }
}
