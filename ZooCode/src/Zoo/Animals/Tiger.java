package Zoo.Animals;

public class Tiger extends Feline{

    public Tiger(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "tiger";
    }

    @Override
    public boolean wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the tiger wakes up, snarls and sharply roars at the zookeeper");

        System.out.println(wake);

        return true;
    }

    @Override
    public boolean makeNoise() {

        StringBuffer growl = new StringBuffer(getName());
        growl.append(" the tiger growls at the zookeeper");

        System.out.println(growl);

        return true;
    }
}
