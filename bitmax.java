import java.util.*;
class Hel
{
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        if ((a|b)==a)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}