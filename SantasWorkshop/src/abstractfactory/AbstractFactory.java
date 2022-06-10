package abstractfactory;

public abstract class AbstractFactory
{
    public abstract Toy getToy(String toyName);

    public abstract Color getColor(String colorName);
}