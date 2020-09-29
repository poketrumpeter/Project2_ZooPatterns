package Zoo.Animals;

import Zoo.Animals.Movements.AnimalMovement;

public abstract class Canine extends DefaultAnimal{

    public Canine(AnimalMovement movement, String name) {
        super(movement, name);
    }

    @Override
    public String getClassification() {
        return "Canine";
    }

    @Override
    public boolean Sleep() {
        //Method to have the specific animal go to sleep
        StringBuffer sleep = new StringBuffer(getName()); //String buffer to creat output string
        sleep.append( " the ");
        sleep.append(getSpecies());
        sleep.append(" goes to sleep with it's friends dreaming happy dreams");

        System.out.println(sleep); //prints the contents of String Buffer

        return true;
    }

}
