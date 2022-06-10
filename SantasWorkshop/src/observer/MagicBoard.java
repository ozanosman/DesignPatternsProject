package observer;

import java.util.ArrayList;
import java.util.List;
public class MagicBoard implements Observable
{
    private List<Observer> observers;
    private String magicBoard;

    public MagicBoard()
    {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer)
    {
        this.observers.add(observer);
        observer.setMagicBoard(this);
    }

    @Override
    public void unsubscribe(Observer observer)
    {
        this.observers.remove(observer);
        observer.setMagicBoard(null);
    }

    @Override
    public void notifyObservers()
    {
        for(Observer observer: this.observers)
        {
            observer.update();
        }
    }

    @Override
    public String getUpdate()
    {
        return this.magicBoard;
    }

    public void setOrder(String magicBoard)
    {
        this.magicBoard = magicBoard;
        this.notifyObservers();
    }
}