class Fruit
{
    int quantity;
}
class Vegetables
{
    int quantity;
}

public class ClassObjBasic
{
    public static void main(String args[])
    {
        Fruit apple = new Fruit();
        apple.quantity = 10;
        Vegetables potato = new Vegetables();
        potato.quantity = 20;
        System.out.println("I have " + apple.quantity + " apples and " + potato.quantity + " potatoes.");
    }
}