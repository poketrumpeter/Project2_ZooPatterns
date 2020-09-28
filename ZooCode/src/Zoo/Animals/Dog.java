package Zoo.Animals;


public class Dog extends Canine {

    public Dog(String name) {
        super(new DogMovement(), name);
    }

    @Override
    public String getSpecies() {
        return "dog";
    }

    //Overridden function to Wake up the Dog when the Zookeeper goes to wake the animals
    @Override
    public boolean wakeUp() {
        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the dog wakes up and barks happily");

        System.out.println(wake);

        return true;
    }

    @Override
    public boolean Eat() {
        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the dog happily and quickly consumes its food then smiles at the zookeeper");

        System.out.println(eat);

        return true;
    }

    @Override
    public boolean makeNoise() {

        StringBuffer bark = new StringBuffer(getName());
        bark.append(" the dog barks");

        System.out.println(bark);

        return true;

    }

}
