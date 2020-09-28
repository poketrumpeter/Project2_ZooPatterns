package Zoo.Animals;

public class Rhino extends Pachyderm{

    public Rhino(AnimalMovement movement, String name) {
        super(new RhinoRoam(), name);
    }

    @Override
    public String getSpecies() {
        return "rhino";
    }

    @Override
    public boolean wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the rhino slowly rises and curiously looks at the zookeeper");

        System.out.println(wake);

        return true;
    }

    @Override
    public boolean makeNoise() {
        StringBuffer squeal = new StringBuffer(getName());
        squeal.append(" the rhino squeals at the zookeeper");

        System.out.println(squeal);

        return true;
    }
}
