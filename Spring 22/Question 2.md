# Analyze the following codes
## a)
``` java
public class Test {
 public static void main(String[] args) {
    // creating an instance of Date and assigns it to x
    java.util.Date x = new java.util.Date();
    // cloning x and assigning it to y but it gives compile error because clone() returns an object
    // correction ---> java.util.Date y = (Date) x.clone();
    java.util.Date y = x.clone();
    // printing x = y which is just printing x after assigning y to it
    System.out.println(x = y);
 }
} 
```

## b) 
``` java
public class Test {
    public static void main(String[] args) {
       // Creating an array of Fruit objects
        Fruit[] fruits = {new Fruit(2), new Fruit(3), new Fruit(1)};
       // Exception is thrown because Fruit class doesn't implement Comparable interface
        java.util.Arrays.sort(fruits);
    }
}

// creating class Fruit
class Fruit {
   // declaring data fields
    private double weight;
  // declaring constructor Fruit that takes weight as argument and assigns it to weight of the data field
    public Fruit(double weight) {
        this.weight = weight;
    }
}
```











