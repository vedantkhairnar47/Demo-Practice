class Demo
{
    public void Display()
    {
        int i = 10;
        final int j = 20;       // final local variable

        i++;
        //j++;
    }
}

class FinalDemo1
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Display();
    }
}