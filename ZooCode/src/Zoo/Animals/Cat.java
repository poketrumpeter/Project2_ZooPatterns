package Zoo.Animals;

public class Cat extends Feline{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "cat";
    }

    @Override
    public boolean wakeUp() {

        StringBuffer wake = new StringBuffer(getName()); //String buffer to form output string
        wake.append(" the cat wakes up slowly with a gentle purr. The cat looks up to the Zookeeper with a cute look.");

        System.out.println(wake);

        return true;
    }

    @Override
    public boolean Eat() {
        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the cat sips milk and eats its food slow and quiet");

        System.out.println(eat);

        return true;
    }

    @Override
    public boolean makeNoise() {
        //Purr
        StringBuffer purr = new StringBuffer(getName());
        purr.append(" the cat purrs quietly at the zookeeper");

        System.out.println(purr);

        return true;
    }
}
