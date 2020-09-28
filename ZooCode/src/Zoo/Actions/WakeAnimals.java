
package Zoo.Actions;
import Zoo.Animals.Animal;


public class WakeAnimals extends defaultAnimalTask {

    public WakeAnimals() {
        super("Wake Animals");
    }

    @Override
    public boolean callAnimalTask(Animal animal) {
        return animal.wakeUp();
    }
}
