package Zoo.Animals;

import Zoo.Animals.Movements.CanineRoam;

public class Wolf extends Canine{

    public Wolf(String name) {
        super(new CanineRoam(), name); //uses Canine roam Because Wolf doesnt have specific roam method
    }

    @Override
    public String getSpecies() {
        return "wolf";
    }

    @Override
    public boolean wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the wolf wakes up and snarls at the zookeeper at");

        System.out.println(wake);

        return true;
    }

    @Override
    public boolean Eat() {

        StringBuffer eat = new StringBuffer(getName());
        eat.append(" ferociously devours his meals while eyeing the zookeeper");
        System.out.println(eat);

        return true;
    }

    @Override
    public boolean makeNoise() {

        StringBuffer howl = new StringBuffer(getName());
        howl.append(" the wolf howls at the zookeeper");

        System.out.println(howl);

        return true;
    }
}
