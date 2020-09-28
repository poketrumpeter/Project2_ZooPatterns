package Zoo.People;

import Zoo.Animals.Animal;

public class FeedAnimals extends defaultAnimalTask{

    public FeedAnimals() {
        super("feed the animals");
    }

    @Override
    public boolean callAnimalTask(Animal animal) {
        return animal.Eat();
    }
}
