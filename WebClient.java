package observerpattern;

import java.util.ArrayList;

public class WebClient implements Observer {
    private String name;
    private ArrayList<Subject> myList;
    
       public WebClient(Subject sub, String name) {
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
