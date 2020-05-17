interface A
{
    public void meth1();
    public void meth2();
}
public class MyClass implements A
{
    public void meth1()
    {
        System.out.println("Using iinterface.");       
    }
    public void meth2()
    {
        System.out.println("Basic Function definition.");       
    }

    public static void main(String args[])
    {
        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
    }

}