package Zoo.Animals;

public class CanineRoam implements AnimalMovement {

    @Override
    public boolean animalMove() {

        //Animal will roam , walking on land
        //System.out.print("Canine Roam");

        System.out.println(" runs around its enclosure");


        return true;
    }
}
