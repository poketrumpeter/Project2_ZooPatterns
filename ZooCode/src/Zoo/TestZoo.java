package Zoo;

import Zoo.Animals.Animal;
import Zoo.Animals.Dog;
import Zoo.Animals.Shark;
import Zoo.People.ZooAnnouncer;
import Zoo.People.ZooEmployee;
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

        boolean completed = false;

        while (!completed){
            completed = dog1.Move(); //Testing functionality of Strategy Pattern
        }

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




    }


}
