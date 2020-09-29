package Zoo.Animals.Movements;

public class ElephantRoam extends PachydermMovement{

    @Override
    public boolean pachydermRoam() {

        System.out.println(" the elephant slowly walks around its enclosure looking to play with its " +
                "friends");

        return true;
    }
}
