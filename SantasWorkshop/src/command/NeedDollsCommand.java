package command;

public class NeedDollsCommand implements Command
{
    private Toys toys;

    public NeedDollsCommand(Toys toys)
    {
        this.toys = toys;
    }

    @Override
    public void execute()
    {
        this.toys.needDolls();
    }
}