class Demo
{
    public static void main(String args[])
    {
        int a=30,b=20,c=10;
        if(a<b)
        {
            if(a<c)
            {
                System.out.println("a is smaller");
            }
            else
            {
                System.out.println("c is smaller");
            }
        }    
        else
        {
            if(b<a)
            {
                System.out.println("b is smaller");
            }
            else
            {
                System.out.println("c is smaller");

            }
        }    
    }
}

