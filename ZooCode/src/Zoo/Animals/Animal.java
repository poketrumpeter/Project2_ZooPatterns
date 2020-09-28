package Zoo.Animals;

public interface Animal {

    String getName(); // method to grab the name of an animal

    String getSpecies(); // Method to get the specific species of an animal i.e Dog

    String getClassification(); //Method to get the specific Classification of an animal i.e Canine

    boolean Move();

    boolean Sleep(); //method to have the animal go to sleep

    boolean wakeUp(); //method to wake an animal up

    boolean Eat(); //Method to have the animals eat food

    boolean makeNoise();

    //Each animal will have a specific method for sleeping, waking up, eating, and roaming

}
