package observerpattern;

import java.util.ArrayList;

public class Thermometer implements Subject {

    private double temp;
    private ArrayList<Observer> list; 
    
    public Thermometer(double temp) {
        this.temp=temp;
        list=new ArrayList<>();
    }
    
    @Override
    public void Notify() {
        if(list.isEmpty()) System.out.println("No one to notify.");
        else for(Observer obs:list) obs.Notified(temp);
    }

    @Override
    public void increaseTemp(double change) {
        temp+=change;
        System.out.println("-----Temperature increased by "+change);
        Notify();
    }
    
    @Override
    public void decreaseTemp(double change) {
        temp-=change;
        System.out.println("-----Temperature decreased by "+change);
        Notify();
    }

    @Override
    public void getValue() {
        System.out.println("The temperature is: "+temp+" Celsius degrees.");
    }

    @Override
    public void addObserver(Observer obs) {
        list.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        if(list.contains(obs)) list.remove(obs);
        else System.out.println("This observer is not registered.");
    }
    
}
