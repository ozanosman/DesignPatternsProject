import abstractfactory.AbstractFactory;
import abstractfactory.Color;
import abstractfactory.FactoryProducer;
import abstractfactory.Toy;
import command.*;
import observer.Gnome;
import observer.MagicBoard;
import observer.Observer;
import singleton.Santa;

public class Application
{
    public static void main(String[] args)
    {
        Santa connection = Santa.getInstance();
        connection.postMessage();

        Toys toys  = new Toys();

        Command needDollsCommand = new NeedDollsCommand(toys);
        Command needBicyclesCommand = new NeedBicyclesCommand(toys);

        RemoteController controller = new RemoteController();

        MagicBoard board = new MagicBoard();

        Observer obs1 = new Gnome("Джудже 1");
        Observer obs2 = new Gnome("Джудже 2");
        Observer obs3 = new Gnome("Джудже 3");

        board.subscribe(obs1);
        board.subscribe(obs2);
        board.subscribe(obs3);

        AbstractFactory toyFactory = FactoryProducer.getFactory("Играчка");

        AbstractFactory colorFactory = FactoryProducer.getFactory("Цвят");

        Toy doll;
        Toy bicycle;

        Color blue;
        Color red;

        switch (Santa.order)
        {
            case 0: controller.setCommand(needDollsCommand);
                controller.pressButton();

                board.setOrder("Дядо Коледа иска кукли!");

                doll = toyFactory.getToy("Кукла");
                doll.create();

                blue = colorFactory.getColor("Синьо");
                blue.paint();
                break;
            case 1: controller.setCommand(needBicyclesCommand);
                controller.pressButton();

                board.setOrder("Дядо Коледа иска колела!");

                bicycle = toyFactory.getToy("Колело");
                bicycle.create();

                red = colorFactory.getColor("Червено");
                red.paint();
                break;
            case 2: controller.setCommand(needDollsCommand);
                controller.pressButton();

                controller.setCommand(needBicyclesCommand);
                controller.pressButton();

                board.setOrder("Дядо Коледа иска кукли и колела!");

                doll = toyFactory.getToy("Кукла");
                doll.create();

                blue = colorFactory.getColor("Синьо");
                blue.paint();

                bicycle = toyFactory.getToy("Колело");
                bicycle.create();

                red = colorFactory.getColor("Червено");
                red.paint();
                break;
        }
    }
}