package Zoo.Animals.Movements;

public class FelineMovement implements AnimalMovement{

    @Override
    public boolean animalMove() {

        System.out.println(" walks gracefully around its enclosure");

        return true;
    }

}
