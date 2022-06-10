package abstractfactory;

public class FactoryProducer
{
    public static AbstractFactory getFactory(String factoryName)
    {
        if (factoryName.equals("Играчка"))
        {
            return new ToyFactory();
        }

        if (factoryName.equals("Цвят"))
        {
            return new ColorFactory();
        }

        System.out.println("Неизвестна работилница!");
        return null;
    }
}