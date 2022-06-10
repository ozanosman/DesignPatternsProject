package abstractfactory;

public class Bicycle implements Toy
{
    @Override
    public void create()
    {
        System.out.println("<Създаване на колело>");
    }
}