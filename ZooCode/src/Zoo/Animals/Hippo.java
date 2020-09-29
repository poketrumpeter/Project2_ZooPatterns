package Zoo.Animals;

import Zoo.Animals.Movements.AnimalMovement;
import Zoo.Animals.Movements.HippoRoam;

public class Hippo extends Pachyderm{

    public Hippo(String name) {
        super(new HippoRoam(), name);
    }

    @Override
    public String getSpecies() {
        return "hippo";
    }

    @Override
    public boolean wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the Hippo wakes up and slowly gets out of the water");

        System.out.println(wake);

        return true;
    }

    @Override
    public boolean makeNoise() {

        StringBuffer grunt = new StringBuffer(getName());
        grunt.append(" the hippo gives a low grunt");

        System.out.println(grunt);

        return true;
    }
}
