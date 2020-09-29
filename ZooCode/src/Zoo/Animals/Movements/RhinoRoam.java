package Zoo.Animals.Movements;

public class RhinoRoam extends PachydermMovement{

    @Override
    public boolean pachydermRoam() {

        //Rhino Specific Move method
        System.out.println(" the rhino defensively runs around its enclosure wary of the Zookeeper");
        return true;

    }

}
