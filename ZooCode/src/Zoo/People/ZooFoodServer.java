package Zoo.People;

import java.util.ArrayList;

public class ZooFoodServer extends ZooEmployee implements Subject{

    private ArrayList<Observer> observers;

    public ZooFoodServer(String name) {
        super(name, "food server");
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }


    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        //Check to make sure we have a valid index
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(String task) {

        //This will count through all the observers and notify them by calling update
        for(Observer observer : observers){
            observer.update(this, task);
        }

    }

    //Method for making food
    public void makeFood(){

        System.out.println(getName() + " Is currently serving food");

    }

    //Method for serving food
    public void serveFood(){

        notifyObservers("serve food");

        System.out.println(getName() + " Is currently serving food");

    }

    public void cleanFood(){

        System.out.println(getName() + " Is currently cleaning up food");

    }
}
