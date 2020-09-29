package Zoo.Animals;

import Zoo.Animals.Movements.FelineMovement;

import java.util.Random;

public abstract class Feline extends DefaultAnimal{

    public Feline(String name) {
        super(new FelineMovement(), name);
    }

    @Override
    public String getClassification() {
        return "Feline";
    }

    @Override
    public boolean Sleep() {

        Random randomNum = new Random(); //creating an instance of random to use later

        int felineChoice = randomNum.nextInt(9); //Special case is 30/30/40 split so we need 10 options

        if (felineChoice <= 2){ //0, 1, or 2 for a 30% probability of roaming

            //Feline Roams, Misbehaving
            System.out.print("In defiance of the zookeepers command to sleep, ");

            this.move();

            return false;

        }
        else if(felineChoice <= 5){ //3, 4 or 5 in order to have 30% chance of making noise

            //Feline makes noise, Misbehaving
            System.out.print("In defiance of the zookeepers command to sleep, ");

            makeNoise();

            return false;
        }
        else {
            //Feline will go to sleep as normal, 40% chance
            StringBuffer sleep = new StringBuffer(getName());
            sleep.append(" the ");
            sleep.append(getSpecies());
            sleep.append(" finds a nice spot, gets in a cozy position and falls asleep alone");

            System.out.println(sleep); //outputs the contents of sleep to the console

            return true;
        }


    }

    //This overwritten method will be implemented by the feline class
    //This wont apply to the Cat object because the Cat class will override it

    @Override
    public boolean Eat() {
        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the ");
        eat.append(getSpecies());
        eat.append(" devours the raw meat while eyeing the zookeeper as a tasty meal");

        System.out.println(eat);

        return true;
    }

}
