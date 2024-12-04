class H
{
    public static void main(String args[])
    {
        int a=5,pos=2;
        if((a&(1<<pos))==0)
        {
        System.out.println("not a setbit");
        }
        else
        {
            System.out.println("setbit");
        }
    }
}