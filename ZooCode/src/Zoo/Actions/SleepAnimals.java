
package Zoo.Actions;

import Zoo.Actions.defaultAnimalTask;
import Zoo.Animals.Animal;

public class SleepAnimals extends defaultAnimalTask {

    public SleepAnimals() {
        super("sleep animals");
    }

    @Override
    public boolean callAnimalTask(Animal animal) {
        return animal.Sleep();
    }
}
