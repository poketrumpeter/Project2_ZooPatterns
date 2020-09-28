package Zoo.Actions;

import Zoo.Actions.defaultAnimalTask;
import Zoo.Animals.Animal;

public class RollCallAnimals extends defaultAnimalTask {

    public RollCallAnimals() {
        super("roll call animals");
    }

    @Override
    public boolean callAnimalTask(Animal animal) {
        return animal.makeNoise();
    }
}
