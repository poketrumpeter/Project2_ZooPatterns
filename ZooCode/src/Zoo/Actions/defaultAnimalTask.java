package Zoo.People;

import Zoo.Animals.Animal;

import java.util.ArrayList;

public abstract class defaultAnimalTask implements AnimalTask {

    boolean taskDone;
    String taskName;

    public defaultAnimalTask(String taskName) {
        this.taskName = taskName;
        this.taskDone = false;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public void performTask(ArrayList<Animal> animals) {
        boolean completed;
        for(Animal  currentAnimal : animals){

            completed = false;
            while (!completed){

                completed = callAnimalTask(currentAnimal); //will call each animals wakeUp method

                System.out.println();
            }


        }
    }

    public abstract boolean callAnimalTask(Animal animal);
}

