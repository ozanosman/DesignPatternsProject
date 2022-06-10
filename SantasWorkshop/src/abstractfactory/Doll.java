package abstractfactory;

public class Doll implements Toy
{
    @Override
    public void create()
    {
        System.out.println("<Създаване на кукла>");
    }
}