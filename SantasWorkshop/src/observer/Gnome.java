package observer;

public class Gnome implements Observer
{
    private String name;
    private Observable magicBoard;

    public Gnome(String name)
    {
        this.name = name;
    }

    @Override
    public void update()
    {
        if (this.magicBoard == null)
        {
            System.out.println("Няма зададена заповед!");
            return;
        }

        String lastOrder = this.magicBoard.getUpdate();
        System.out.println(this.name + " получи: " + lastOrder);
    }

    @Override
    public void setMagicBoard(Observable magicBoard)
    {
        this.magicBoard = magicBoard;
    }
}