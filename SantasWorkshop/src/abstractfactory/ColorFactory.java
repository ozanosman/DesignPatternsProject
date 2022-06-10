package abstractfactory;

public class ColorFactory extends AbstractFactory
{
    @Override
    public Toy getToy(String toyName)
    {
        return null;
    }

    @Override
    public Color getColor(String colorName)
    {
        if (colorName.equals("Синьо"))
        {
            return new Blue();
        }

        if (colorName.equals("Червено"))
        {
            return new Red();
        }

        System.out.println("Неизвестен цвят!");
        return null;
    }
}