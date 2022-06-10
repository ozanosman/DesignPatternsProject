package singleton;

import java.util.concurrent.ThreadLocalRandom;

public class Santa
{
    private static Santa instance;

    public static int order = ThreadLocalRandom.current().nextInt(0,3);

    private Santa()
    {

    }

    public static Santa getInstance()
    {
        if (instance == null)
        {
            instance = new Santa();
        }

        return instance;
    }

    public void postMessage()
    {
        String message;

        switch (order)
        {
            case 0: message = "Трябват ми кукли!";
                break;
            case 1: message = "Трябват ми колела!";
                break;
            case 2: message = "Трябват ми кукли и колела!";
                break;
            default: message = "Няма съобщение!";
                break;
        }

        System.out.println("Дядо Коледа: " + message);
    }
}