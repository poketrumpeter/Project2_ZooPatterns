package Zoo.Animals;

import Zoo.Animals.Movements.FishSwim;

public class ClownFish extends Fish{

    public ClownFish(String name) {
        super(new FishSwim(), name);
    }

    @Override
    public String getSpecies() {
        return "clownfish";
    }

    @Override
    public boolean wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the clownfish wakes and exits it's anemone cautious of predators");

        System.out.println(wake);

        return true;
    }

    @Override
    public boolean Eat() {

        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the clownfish nibbles on the fish food the zookeeper gives it");

        System.out.println(eat);

        return true;
    }

    @Override
    public boolean Sleep() {
        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" the clownfish settles down in its anemone and falls asleep");

        System.out.println(sleep);

        return true;
    }

    @Override
    public boolean makeNoise() {

        StringBuffer chirpPop = new StringBuffer(getName());
        chirpPop.append(" the clownfish chirps and pops");

        System.out.println(chirpPop);

        return true;
    }
}
