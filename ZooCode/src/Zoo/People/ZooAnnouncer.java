package Zoo.People;

/*
 ZooAnnouncer will be an observer of many classes using an observer pattern.
 It will implement an observer interface

 */

public class ZooAnnouncer extends ZooEmployee implements Observer{

    public ZooAnnouncer(String name) {
        super(name, "Zoo Announcer");
    }

    @Override
    public void update(ZooEmployee employee, String Task) {

        //Whenever a task is initiated,
        StringBuilder msg = new StringBuilder("*************** " + employee.getName());
        msg.append(" the ").append(employee.getJob()).append(" is about to ").append(Task)
                .append(" *************** ");

        System.out.println(msg);
        System.out.println();
    }

}
