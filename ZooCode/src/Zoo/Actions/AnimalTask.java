package Zoo.Actions;

import Zoo.Animals.Animal;

import java.util.ArrayList;

public interface AnimalTask {

    public void performTask(ArrayList<Animal> animals);

    public String getTaskName();
}
