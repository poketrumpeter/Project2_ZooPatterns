package Zoo.Animals;

import java.util.Random;

public class DogMovement extends CanineRoam{

    @Override
    public boolean animalMove() {

        if (!doesMisbehave()){
            return super.animalMove();
        }

        System.out.print(" misbehaves, doesnt roam, and digs instead.");

        return false;

    }

    boolean doesMisbehave(){
        //25% chance the dog will dig instead of roaming
        Random randomNum = new Random();

        int dogChoice = randomNum.nextInt(3);

        if(dogChoice == 0) {// 1/4 possibilities, so we call dog Dig


            return true; //indicate that dog has not roamed yet
        }
        else {

            return false;
        }
    }

}
