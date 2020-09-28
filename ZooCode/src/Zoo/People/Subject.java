package Zoo.People;

public interface Subject {

    //WIll layout methods to be able to work with the observer

    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(String Task);

}
