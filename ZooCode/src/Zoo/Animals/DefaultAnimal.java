package Zoo.Animals;

public abstract class DefaultAnimal implements Animal{

    AnimalMovement movement;

    private final String name;

    private Boolean asleep = true; //Boolean to tell if an animal is asleep

    public DefaultAnimal(AnimalMovement movement, String name) {
        this.movement = movement;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean Move() {

        boolean status;

        StringBuffer msg = new StringBuffer(getName());
        msg.append(" the ");
        msg.append(getSpecies());

        System.out.print(msg);

        status =  movement.animalMove();

        System.out.println();

        return status;
    }
}
