package Zoo;

import Zoo.Animals.*;
import Zoo.People.ZooAnnouncer;
import Zoo.People.ZooFoodServer;
import Zoo.People.ZooKeeper;

import java.util.ArrayList;

public class TestZoo {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<Animal>();

        Animal dog1 = new Dog("Darren");
        animals.add(dog1);

        Animal shark1 = new Shark("Sally");
        animals.add(shark1);

        Animal rhino1 = new Rhino("Rex");

        Animal cat1 = new Cat("Chloe");

        boolean completed = false;

        while (!completed){
            completed = dog1.move(); //Testing functionality of Strategy Pattern
        }

        dog1.makeNoise();
        cat1.Sleep();
        rhino1.move();

        //Testing Zookeeeper Methods
        ZooKeeper keeper = new ZooKeeper("Fester");
        keeper.arrive("8:00");

        //Testing ZooAnouncer
        ZooAnnouncer announcer = new ZooAnnouncer("Carly");
        announcer.arrive("8:00");

        //Testing ZooFoodServer
        ZooFoodServer server = new ZooFoodServer("Christie");
        server.arrive("8:00");

        keeper.addObserver(announcer);
        server.addObserver(announcer);

        keeper.wakeAnimals(animals);

        keeper.rollCallAnimals(animals);

        server.serveFood();


        //Testing Clock
        Clock timeKeeper = new Clock();

        timeKeeper.displayTime();

        System.out.println();

        for (int i = 0; i < 23; i++){

            timeKeeper.displayTime();

            timeKeeper.incrementTime();
        }

    }


}
