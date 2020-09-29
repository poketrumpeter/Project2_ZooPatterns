package Zoo.People;

//Zookeeper will implement the Subject interface because it will be observed by an observer.
// Whenever the Zookeeper performs an action, they will alert the zookeeper

import Zoo.Actions.*;
import Zoo.Animals.Animal;
import Zoo.Clock;

import java.util.ArrayList;

public class ZooKeeper extends ZooEmployee implements Subject{

    private ArrayList<Observer> observers;

    private boolean wokeAnimals;
    private boolean rollCalledAnimals;
    private boolean fedAnimals;
    private boolean exercisedAnimals;
    private boolean putAnimalsToSleep;

    public ZooKeeper(String name) {
        super(name, "ZooKeeper");
        this.observers = new ArrayList<Observer>();

        wokeAnimals = false;
        rollCalledAnimals = false;
        fedAnimals = false;
        exercisedAnimals = false;
        putAnimalsToSleep = false;
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

    public void wakeAnimals(ArrayList<Animal> animalList) {

        AnimalTask wake = new WakeAnimals(); //Wake Animals will be a task but use the Wake animals

        notifyObservers("wake the animals"); //Before going to wake the animals, notify all observers

        System.out.println(getName() + " the Zookeeper goes to wake the animals");

        System.out.println();

        wake.performTask(animalList);


    }

    public void rollCallAnimals(ArrayList<Animal> animalList){

        AnimalTask rollCall = new RollCallAnimals();

        notifyObservers(rollCall.getTaskName());

        System.out.println("ZOOKEEPER: " + getName() + " the zookeeper goes to roll call the animals");

        System.out.println();

        rollCall.performTask(animalList);
    }

    public void feedAnimals(ArrayList<Animal> animalList){

        AnimalTask feed = new FeedAnimals();

        notifyObservers(feed.getTaskName());

        System.out.println("ZOOKEEPER: " + getName() + " the zookeeper goes to feed the animals");

        System.out.println();

        feed.performTask(animalList);
    }

    public void sleepAnimals(ArrayList<Animal> animalList){

        AnimalTask sleepAnimals = new SleepAnimals();

        notifyObservers(sleepAnimals.getTaskName());

        System.out.println("ZOOKEEPER: " + getName() + " the zookeeper goes to put the animals to sleep");

        System.out.println();

        sleepAnimals.performTask(animalList);
    }

    public void exerciseAnimals(ArrayList<Animal> animalList){

        AnimalTask exercise = new ExerciseAnimals();

        notifyObservers(exercise.getTaskName());

        System.out.println("ZOOKEEPER: " + getName() + " the zookeeper goes to Exercise the animals");

        System.out.println();

        exercise.performTask(animalList);
    }

    public void performZooTasks(Clock clock, ArrayList<Animal> animalList) { //allows ZooEmployee to go through zookeeper methods

        if(clock.getTime() == 9){

            wakeAnimals(animalList);
            wokeAnimals = true;

        }

        else if (clock.getTime() == 10){

            rollCallAnimals(animalList);
            rollCalledAnimals = true;

        }

        else if(clock.getTime() == 1){

            feedAnimals(animalList);
            fedAnimals = true;

        }
        else if(clock.getTime() == 3){

            exerciseAnimals(animalList);
            exercisedAnimals = true;

        }

        else if(clock.getTime() == 7){

            sleepAnimals(animalList);
            putAnimalsToSleep = true;

        }

    }

    public boolean checkDone() {

        if (wokeAnimals && rollCalledAnimals && fedAnimals && exercisedAnimals && putAnimalsToSleep){

            System.out.println(getName() + " has completed all tasks");
            return true;
        }
        return false;
    }

    public void taskReset() {
        this.wokeAnimals = false;
        this.rollCalledAnimals = false;
        this.fedAnimals = false;
        this.exercisedAnimals = false;
        this.putAnimalsToSleep = false;
    }
}
