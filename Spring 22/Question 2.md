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

## c)
``` java
public class Test {
    public static void main(String[ ] args) {
        // Create a Number object 'x' and assign it an Integer instance with a value of 3
        Number x = new Integer (3);
        // Print the integer value of 'x' using the intValue() method
        System.out.println(x.intValue());
        /* 
         * Compile error: x doesn't contain a function called compareTo() because class Number doesn't implement Comparable interface
         * Note that the dot operator has higher priority than casting
         * Correction: System.out.println(((Integer) x).compareTo(new Integer(4)));
         * Output: 
         * 3
         * -1
         */
        System.out.println( (Integer) x.compareTo(new Integer(4)));
    }
}
```

## d)
``` java
// Creating class base
class Base {
   // Creating non parameterized constructor of class Base
    Base() {
       // On calling the constructor print "Base is invoked"
        System.out.println("Base is invoked");
    }
}

// Creating class Derived that extends Base
class Derived extends Base {
  // Creating non parameterized constructor of class Derived
    Derived() {
       // Note that the compiler adds super() automatically 
       // super(); 
       // Print "Derived is created"
        System.out.println("Derived is created");
    }
}

// Test class
class TestSuper3 {
// main method
    public static void main(String args[]) {
       // Creating an instance of Base
        Base b = new Base();  // print "Base is invoked"
        
        // Creating an instance of Derived
        // print "Base is invoked" 
        // "Derived is created"
        Derived d = new Derived();
    }
}
```
### Output: 
```
Base is invoked
Base is invoked
Derived is created
```

## e)
``` java
public class Test {
    public static void main(String[] args) {
       // Creating two instances of Object class and assigning them to o1 & o2
        Object o1 = new Object();
        Object o2 = new Object();
        // print the result of (o1 == o2) + "  " + o1.equals(o2)
        System.out.println((o1 == o2) + "  " + o1.equals(o2));
        // Output: false false
        // first is false because " o1 == o2 " returns false because " o1 == o2 " compares between two references
        // and they don't point to the same object 
        // second is false bcz implementation of equals in the object class also compares the references
        //if parentheses around " o1==o2 " are not there it will only print false
        //bcz it will treat every thing after the "==" as the same operand
    }
}



```









