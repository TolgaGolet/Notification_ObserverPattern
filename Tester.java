package observerpattern;


public class Tester {
    public static void main(String[] args) {
        Thermometer tm1=new Thermometer(25);
        tm1.getValue();
        ControlPanel cp1=new ControlPanel(tm1, "Control Panel");
        Mobile mob1=new Mobile(tm1, "Mobile");
        WebClient wb1=new WebClient(tm1, "Web Client");
        SMSObserver sms1=new SMSObserver(tm1, "SMS Observer");
        
        tm1.increaseTemp(1);
        tm1.decreaseTemp(2.5);
    }
}
