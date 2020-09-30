package Zoo.Animals;

import Zoo.Animals.Movements.AnimalMovement;

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

    /*
    This is the main place where the strategy pattern is being used. Rather than use inheritance with
    the movement property of animals. Each animal will use this specific move function.
    Each animmal has its own movement object that specifies how it will move/roam. All these
    movements implement the interface AnimalMovement. When declaring animals, we initalize them with a
    speciric movement to be able to move in the correct way. Currently the animal object doesnt know
    the implementation for move, they just know which movement object they have.
     */

    @Override
    public boolean move() {

        boolean status;

        StringBuffer msg = new StringBuffer(getName());
        msg.append(" the ");
        msg.append(getSpecies());

        System.out.print(msg);

        status =  movement.animalMove();

        return status;
    }

}
