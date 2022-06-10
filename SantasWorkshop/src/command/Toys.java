package command;

public class Toys
{
    private boolean dolls;
    private boolean bicycles;

    public void needDolls()
    {
        System.out.println("| Кукла  |");

        this.dolls = true;
        this.bicycles = false;
    }

    public void needBicycles()
    {
        System.out.println("| Колело |");

        this.dolls = false;
        this.bicycles = true;
    }
}