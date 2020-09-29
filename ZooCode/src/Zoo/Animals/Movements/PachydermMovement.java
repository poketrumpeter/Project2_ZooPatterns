package Zoo.Animals.Movements;

import java.util.Random;

public abstract class PachydermMovement implements AnimalMovement{

    @Override
    public boolean animalMove() {

        if (!doesMisbehave()){
            return pachydermRoam();
        }

        System.out.println(" misbehaves, doesnt roam, and charges at the zookeeper.");

        return false;

    }

    public abstract boolean pachydermRoam();

    boolean doesMisbehave(){
        //25% chance the dog will dig instead of roaming
        Random randomNum = new Random();

        int pachydermChoice = randomNum.nextInt(3);

        if(pachydermChoice == 0) {// 1/4 possibilities


            return true; //indicate that Pachyderm has not romed yet
        }
        else {

            return false;
        }
    }

}
