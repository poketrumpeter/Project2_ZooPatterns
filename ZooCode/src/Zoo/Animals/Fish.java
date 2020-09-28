package Zoo.Animals;

public abstract class Fish extends DefaultAnimal{

    public Fish(AnimalMovement movement, String name) {
        super(new FishSwim(), name);
    }

    @Override
    public String getClassification() {
        return "Fish";
    }


    //most fish dont swim in a normal way so they will continue to swim but will slow down and enter a restful state
    //this method will be overridden by clownfish because clownfish sleep in an anenome

    @Override
    public boolean Sleep() {

        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" the ");
        sleep.append(getSpecies());
        sleep.append(" slows its function but is still alert resting but not fully asleep");

        System.out.println(sleep);

        return true;

    }
}
