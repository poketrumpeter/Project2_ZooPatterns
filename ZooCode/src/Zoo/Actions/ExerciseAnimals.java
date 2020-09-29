
package Zoo.Actions;

import Zoo.Animals.Animal;

public class ExerciseAnimals extends defaultAnimalTask{

    public ExerciseAnimals() {
        super("exercise the animals");
    }

    @Override
    public boolean callAnimalTask(Animal animal) {
        return animal.move();
    }

}
