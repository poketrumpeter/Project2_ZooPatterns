package Zoo.Animals;

import Zoo.Animals.Movements.FelineMovement;

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
        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" the ");
        sleep.append(getSpecies());
        sleep.append(" finds a nice spot, gets in a cozy position and falls asleep alone");

        System.out.println(sleep); //outputs the contents of sleep to the console

        System.out.println();

        return true;
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
