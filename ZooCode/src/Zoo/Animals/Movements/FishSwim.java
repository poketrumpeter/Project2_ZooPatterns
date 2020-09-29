package Zoo.Animals.Movements;


public class FishSwim implements AnimalMovement{

    @Override
    public boolean animalMove() {

        //Swims Around the Tank
        System.out.print(" Swims around its tank");
        return true;

    }
}
