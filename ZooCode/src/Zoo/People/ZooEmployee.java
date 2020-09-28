package Zoo.People;

public abstract class ZooEmployee {

    /*
    Clear instance of ENCAPSULATION. This is achieved through declaring
    variables of a class as private, and to provide access to these
    variables through getter and setter methods.
     */

    private String name; //name of the employee
    private String job; //name of the job employee has
    private Boolean arrived;
    private int day; //day of zooEmployee working

    public ZooEmployee(String name, String job) {
        this.name = name;
        this.job = job;
        this.arrived = false;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getDay() {
        return day;
    }

    //simply prints out the day of arrival
    public void arrive(String time) {
        StringBuffer arrive = new StringBuffer(getName());
        arrive.append(" the ");
        arrive.append(this.job);
        arrive.append(" arrives at Zoo on day ");
        arrive.append(getDay());
        arrive.append(" at ");
        arrive.append(time);

        arrived = true;

        System.out.println(arrive);

        //return "";
    }

    public void setDay(int day) {
        this.day = day;
    }

}
