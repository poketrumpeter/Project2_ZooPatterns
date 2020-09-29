package Zoo;

public class Clock {

    private int time;
    private String amPM;
    private String fullTime;

    public Clock() {
        this.time = 8;
        this.amPM = "AM";
        this.fullTime = String.valueOf(this.time) + ":00 " + this.amPM;
    }

    public int getTime() {
        return time;
    }

    public String getFullTime() {
        return fullTime;
    }

    public String incrementTime(){

        this.time++;

        if(this.time == 12 && this.amPM.equals("AM")){
            this.amPM = "PM";
        }
        else if(this.time == 12 & this.amPM.equals("PM")){
            this.amPM = "AM";
        }

        if(this.time == 13){
            this.time = 1;
        }

        this.fullTime = String.valueOf(this.time) + ":00 " + this.amPM;

        displayTime();

        return this.fullTime;

    }

    public void displayTime(){

        System.out.print("+++++++++++++++");

        System.out.print("The time is now " + this.fullTime);

        System.out.println("+++++++++++++++");

        System.out.println();
    }

    public void reset(){
        this.time = 8;
        this.amPM = "AM";
    }
}
