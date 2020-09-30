package Zoo;

import Zoo.Animals.*;
import Zoo.People.ZooAnnouncer;
import Zoo.People.ZooFoodServer;
import Zoo.People.ZooKeeper;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainZoo {

    public static void main(String[] args) throws FileNotFoundException {

        //For outputing to a file I refered to this resource
        //https://www.dev2qa.com/how-to-write-console-output-to-text-file-in-java/

        PrintStream originalOutput = System.out;
        PrintStream fileOutput = new PrintStream("../dayatthezoo.out");

        System.setOut(fileOutput);

        //First Before doing anything, we need to create our animals that will exist in the Zoo.
        //Also make an animal list object to contain all our animals
        System.out.println("Welcome to the new Age Zoo!(Working Title)");

        //Declare Animals and animal List

        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Receiving Animals for the new Zoo");
        System.out.println();

        Animal dog1 = new Dog("Darren"); //Should default name of Dog to Darren
        Animal dog2 = new Dog("Dhalia");

        animals.add(dog1);
        animals.add(dog2);

        //Adding Wolves to the Zoo
        Animal wolf1 = new Wolf("Willy");
        Animal wolf2 = new Wolf("Wanda");

        animals.add(wolf1);
        animals.add(wolf2);

        //Adding Cats to the Zoo
        Animal cat1 = new Cat("Cleo");
        Animal cat2 = new Cat("Carlos");

        animals.add(cat1);
        animals.add(cat2);

        //Adding lions to the Zoo
        Animal lion1 = new Lion("Lex");
        Animal lion2 = new Lion("Leah");

        animals.add(lion1);
        animals.add(lion2);

        //Adding tigers to the Zoo
        Animal tiger1 = new Tiger("Terry");
        Animal tiger2 = new Tiger("Thalia");

        animals.add(tiger1);
        animals.add(tiger2);

        //Adding Rhinos to the zoo
        Animal rhino1 = new Rhino("Ryan");
        Animal rhino2 = new Rhino("Rachel");

        animals.add(rhino1);
        animals.add(rhino2);

        //Adding elephants to the Zoo
        Animal elephant1 = new Elephant("Ella");
        Animal elephant2 = new Elephant("Eddie");

        animals.add(elephant1);
        animals.add(elephant2);

        //Adding Hippos to the Zoo
        Animal hippo1 = new Hippo("Hilda");
        Animal hippo2 = new Hippo("Harry"); //Name should change to Hector

        animals.add(hippo1);
        animals.add(hippo2);

        //Adding Sharks to the zoo
        Animal shark1 = new Shark("Sally");
        Animal shark2 = new Shark("Sam");

        animals.add(shark1);
        animals.add(shark2);

        //Adding Clownfish to the Zoo
        Animal clownfish1 = new ClownFish("Carla"); //Name should change to Carly
        Animal clownfish2 = new ClownFish("Christie");

        animals.add(clownfish1);
        animals.add(clownfish2);

        System.out.println("There are now " + animals.size() + " animals in the zoo!!");


        System.out.println("how many Days would you like to spend at the zoo?");
        originalOutput.println("how many days");

        //For taking in user Input, i referred to this source
        //https://www.w3schools.com/java/java_user_input.asp

        Scanner input = new Scanner(System.in);

        int days = input.nextInt();

        //Declare People and add observers
        ZooFoodServer server = new ZooFoodServer("Carly");
        ZooAnnouncer announcer = new ZooAnnouncer("Samantha");
        ZooKeeper keeper = new ZooKeeper("Fester");

        //Declare Objects
        Clock timeKeeper = new Clock();

        for (int i = 0; i < days; i++) {

            //add observers when people arrive
            System.out.println("Welcome to the Zoo! It is now " + timeKeeper.getFullTime()
                    + " on day: " + (i+1) + "!");
            System.out.println();

            keeper.setDay(i+1);
            announcer.setDay((i+1));
            server.setDay(i+1);

            //Have people Arrive to Zoo
            server.arrive(timeKeeper.getFullTime());
            announcer.arrive(timeKeeper.getFullTime());
            keeper.arrive(timeKeeper.getFullTime());

            server.addObserver(announcer);
            keeper.addObserver(announcer);

            System.out.println();

            timeKeeper.displayTime();

            boolean allTasksCompleted = false;

            //Daily Loop for tasks
            while (!allTasksCompleted) { //Main Loop for Zoo

                //have zookeeper perform tasks based on time
                keeper.performZooTasks(timeKeeper, animals);

                //have server perform tasks based on time
                server.performFoodTasks(timeKeeper);

                if (keeper.checkDone() && server.checkDone()) {

                    allTasksCompleted = true;
                }

                timeKeeper.incrementTime();
            }

            System.out.println(server.getName() + "Has completed all tasks. They leave the zoo");

            System.out.println(keeper.getName() + " has completed all tasks. They leave the zoo and " +
                    "lock up for the night");

            //Reset Tasks for the next day
            keeper.taskReset();
            server.taskReset();

            //Remove observers
            keeper.removeObserver(announcer);
            server.removeObserver(announcer);
        }
    }
}
