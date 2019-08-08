package observerpattern;


public interface Subject {
    public void Notify();
    public void increaseTemp(double change);
    public void decreaseTemp(double change);
    public void getValue();
    public void addObserver(Observer obs);
    public void removeObserver(Observer obs);
}
