

class bird
{
    String name;
    private String category = "bird";
}

class Parrot extends bird
{
    void eat()
    {
        System.out.println("I eat chillies!");
    }
}

public class Zoo
{
    public static void main(String args[])
    {
        Parrot mithu = new Parrot();
        mithu.name = "Mithu";
        System.out.println("I am " + mithu.name );
        mithu.eat();
        System.out.println("I am a " + mithu.category );

    }
}