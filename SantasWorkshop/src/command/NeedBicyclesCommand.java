package command;

public class NeedBicyclesCommand implements Command
{
    private Toys toys;

    public NeedBicyclesCommand(Toys toys)
    {
        this.toys = toys;
    }

    @Override
    public void execute()
    {
        this.toys.needBicycles();
    }
}