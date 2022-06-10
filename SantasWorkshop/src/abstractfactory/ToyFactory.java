package abstractfactory;

public class ToyFactory extends AbstractFactory
{
    @Override
    public Toy getToy(String toyName)
    {
        if (toyName.equals("Кукла"))
        {
            return new Doll();
        }

        if (toyName.equals("Колело"))
        {
            return new Bicycle();
        }

        System.out.println("Неизвестна играчка!");
        return null;
    }

    @Override
    public Color getColor(String colorName)
    {
        return null;
    }
}