package Zoo.People;

import Zoo.Animals.Animal;

import java.util.ArrayList;

public class WakeAnimals extends defaultAnimalTask {

    public WakeAnimals() {
        super("Wake Animals");
    }

    @Override
    public boolean callAnimalTask(Animal animal) {
        return animal.wakeUp();
    }
}
