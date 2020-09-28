package Zoo.Animals;

public class Shark extends Fish{

    public Shark(String name) {
        super(new FishSwim(), name);
    }

    @Override
    public String getSpecies() {
        return "shark";
    }

    @Override
    public boolean wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the shark smells blood in the water and wakes up to find fresh food");

        System.out.println(wake);

        return true;

    }

    @Override
    public boolean Eat() {

        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the shark chases and devours the raw meat, cautiously placed in its tank");

        System.out.println(eat);

        return true;

    }

    @Override
    public boolean makeNoise() {
        StringBuffer silence = new StringBuffer(getName());
        silence.append(" the shark silently stares at the Zookeeper because as the " +
                "zookeeper knows, sharks dont make sound");

        System.out.println(silence);

        return true;
    }
}
