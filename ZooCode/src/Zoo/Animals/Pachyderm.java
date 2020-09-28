package Zoo.Animals;


public abstract class Pachyderm extends DefaultAnimal{

    public Pachyderm(AnimalMovement movement, String name) {
        super(movement, name);
    }

    @Override
    public String getClassification() {
        return "Pachyderm";
    }

    @Override
    public boolean Sleep() {

        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" the ");
        sleep.append(getSpecies());
        sleep.append(" goes to sleep wary of predators");

        System.out.println(sleep);

        return true;
    }

    @Override
    public boolean Eat() {

        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the ");
        eat.append(getSpecies());
        eat.append(" consumes the leaves and plants that the zookeeper gives it.");

        System.out.println(eat);

        return true;
    }
}
