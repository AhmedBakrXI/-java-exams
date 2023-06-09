# QUESTION 1
## 1) What is marker interface & what is used for?
- A marker interface does not contain constants or methods.
It is used to denote that a class possesses certain desirable
properties. examples: cloneable interface

## 2) Analyze the code
``` java
public class Test {
// Creates a new class “Test” with “public” access modifier.
public static void main(String[] args) {
// The implementation of the main method.
Number x = new Integer(3);
// Creates an object of type Integer “x” with value of 3. The
// object is stored in an object reference of type “Number”.
System.out.println(x.intValue());
// Prints the value of “x” which is 3.
System.out.println((Integer)x.compareTo(new Integer(4)));
// Compilation error:
// Can’t find compareTo() in an object reference of type “Number”.
// To fix this, x should be explicitly typecasted to “Integer”.
// ((Integer) x).compareTo(new Integer(4))
}
}

// Correction: 
System.out.println(((Integer)x).compareTo(new Integer(4)));
// Output ---> -1 because 3 is < 4
```

## 3) Can you declare a final abstract class?
- No. abstract class is a class that is used to be extended and final class can not be extended "inherited". ---> Compile time error

## 4) Analyze the following code
``` java
public class Test {
    public static void main(String[] args) {
        // Create array of Fruit objects of size 3
        Fruit[] fruits = {new Fruit(2), new Fruit(3), new Fruit(1)};

        // Throws exception called ClassCastException because Fruit doesn't implement Comparable interface
        java.util.Arrays.sort(fruits);

    }
}

class Fruit {
    private double weight;

    // add a constructor
    public Fruit(double weight) {
        this.weight = weight;
    }
}
```

## 5) What is the output of the code
``` java
public class Test {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
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

## 6) ![image](https://github.com/AhmedBakrXI/-java-exams/assets/114930002/76788c46-769d-4521-88ba-cb47edd6e905)
- false. We can not increase the privacy of overriden method
- protected in parent can be protected or public in subclass
- private > no modifier > protected > public

## 7) ![image](https://github.com/AhmedBakrXI/-java-exams/assets/114930002/cb0d8d34-08fe-4064-a8af-afaf455731dc)
- join()

## 8) (TRUE/False) A synchronized statement can be used to acquire a lock on any object, not just this object, when executing a block of the code in a method. 
- True
هي محلولة كدا علي موقع بس أنا صراحة مش فاهم قصده ايه فهو غالبا ممكن يقصد أي أوبجيكت من الكلاس ده أو حاجة
![image](https://github.com/AhmedBakrXI/-java-exams/assets/114930002/4f6cc469-df45-4951-9f61-298072ac3921)


## 9) Give examples of classes that are unchecked exceptions. 
All Runtime exceptions
- IndexOutOfBoundsException
- ArrayIndexOutOfBoundsException
- NullPointerException

## 10) To add a node to the first row and second column in a GridPane pane, use ...
gridPane.add( Node, column, row);
- gridPane.add( Node, 1, 0);
