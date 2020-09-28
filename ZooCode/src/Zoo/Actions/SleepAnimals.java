package Zoo.People;

import Zoo.Animals.Animal;
import Zoo.Animals.DefaultAnimal;

public class SleepAnimals extends defaultAnimalTask {

    public SleepAnimals() {
        super("sleep animals");
    }

    @Override
    public boolean callAnimalTask(Animal animal) {
        return animal.Sleep();
    }
}
