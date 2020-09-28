package Zoo.People;

import Zoo.Animals.Animal;

import java.util.ArrayList;

public class RollCallAnimals extends defaultAnimalTask{

    public RollCallAnimals() {
        super("roll call animals");
    }

    @Override
    public boolean callAnimalTask(Animal animal) {
        return animal.makeNoise();
    }
}
