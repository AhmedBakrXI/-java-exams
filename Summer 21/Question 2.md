``` java
public class Vehicle {
    int no_of_Passengers;

    // We cannot use abstract methods in concrete classes
    // try making Vehicle abstract or remove abstract keyword and write a body for start()
    abstract public void start();
    
    final public void stop() {
        System.out.println("The vehicle is being stoped..."); 
    }
}

// if we make Vehicle abstract then we need to override the start() method
public class Plane extends Vehicle {
    String from, to;

    public Plane(int no_of_Passengers, String from, String to) {
        this.no_of_Passengers = no_of_Passengers;
        this.from = from;
        this.to = to;
    }

    // We cannot override a final method 
    // try to remove final keyword from stop() method
    public void stop() {
        System.out.println("The plane is being stoped ...");
    }
} 
```
