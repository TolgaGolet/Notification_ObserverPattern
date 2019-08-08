package observerpattern;

import java.util.ArrayList;

public class SMSObserver implements Observer {
    private String name;
    private ArrayList<Subject> myList;
    
       public SMSObserver(Subject sub, String name) {
		 sub.addObserver(this);
		 myList=new ArrayList<>();
                 myList.add(sub);
		 this.name=name; 
	}

    @Override
    public void Notified(double temp) {
        System.out.println("Incoming notification to "+name+": Temperature is now "+temp+" Celsius degrees.");
    }

    
}
