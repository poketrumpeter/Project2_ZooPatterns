package Zoo.Animals;

public class Lion extends Feline{

    public Lion(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "Lion";
    }

    @Override
    public boolean wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the lion is awoken and roars at the zookeeper");
        System.out.println(wake);


        return true;
    }

    @Override
    public boolean makeNoise() {

        StringBuffer roar = new StringBuffer(getName());
        roar.append(" the lion roars at the zookeeper");

        System.out.println(roar);

        return true;
    }
}
