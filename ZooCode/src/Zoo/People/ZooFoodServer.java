package Zoo.People;

import Zoo.Clock;

import java.util.ArrayList;

public class ZooFoodServer extends ZooEmployee implements Subject{

    private ArrayList<Observer> observers;

    boolean madeLunch;
    boolean servedLunch;
    boolean cleanedLunch;
    boolean madeDinner;
    boolean servedDinner;
    boolean cleanedDinner;

    public ZooFoodServer(String name) {
        super(name, "food server");
        this.observers = new ArrayList<Observer>();

        madeDinner = false;
        madeLunch = false;
        servedDinner = false;
        servedLunch = false;
        cleanedDinner = false;
        cleanedLunch = false;
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

        System.out.println("FOOD: " + getName() + " Is currently making food");

        System.out.println();

    }

    //Method for serving food
    public void serveFood(){

        notifyObservers("serve food");

        System.out.println("FOOD: " + getName() + " Is currently serving food");

        System.out.println();

    }

    public void cleanFood(){

        System.out.println("FOOD: " + getName() + " Is currently cleaning up food");
        System.out.println();

    }


    public void performFoodTasks(Clock clock) {

        if (clock.getTime() == 11){

            //Make food for Lunch and Dinner
            madeLunch = true;
            makeFood();
        }

        else if (clock.getTime() ==12){

            //Serve Lunch
            servedLunch = true;
            serveFood();
        }

        else if(clock.getTime() == 1){

            //Clean Up
            cleanedLunch = true;
            cleanFood();
        }

        else if(clock.getTime() == 4){

            madeDinner = true;
            makeFood();
        }

        else if(clock.getTime() == 5){
            servedDinner = true;
            serveFood();
        }

        else if(clock.getTime() == 6){

            cleanedDinner = true;
            cleanFood();
        }
    }

    public boolean checkDone() {

        if (madeLunch && servedLunch && cleanedLunch && madeDinner && servedDinner && cleanedDinner){
            System.out.println(getName() + " Has completed all tasks");
            return true;
        }

        return false;
    }

    public void taskReset() {
        this.madeLunch = false;
        this.servedLunch = false;
        this.cleanedLunch = false;

        this.madeDinner = false;
        this.servedDinner = false;
        this.cleanedDinner = false;
    }
}
