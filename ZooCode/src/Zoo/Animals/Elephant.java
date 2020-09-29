package Zoo.Animals;

import Zoo.Animals.Movements.AnimalMovement;
import Zoo.Animals.Movements.ElephantRoam;

public class Elephant extends Pachyderm{

    public Elephant(String name) {
        super(new ElephantRoam(), name);
    }

    @Override
    public String getSpecies() {
        return "elephant";
    }

    @Override
    public boolean wakeUp() {
        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the elephant wakes up and slowly gets up. It gives a little honk with a smile");

        System.out.println(wake);
        return true;
    }

    @Override
    public boolean makeNoise() {

        StringBuffer trumpet = new StringBuffer(getName());
        trumpet.append(" the elephant makes a trumpet sound with its trunk");

        System.out.println(trumpet);

        return true;
    }
}
