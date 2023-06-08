## (1) ………………  used to enable a constructor to invoke another constructor in the same class while ……………… used to invoke parent classes’ data fields
- this
- super

## (2) Analyze the following code.
``` java
// Creates a new class “Test” with “public” access modifier.
class Test {   
  // The implementation of the main method.
  public static void main(String[] args)  {
    // defining reference s of type String
    String s;
    // trying to print the concatonation of "s is " & s which results in compilation error because s has not been initialized
    System.out.println("s is " + s);
  }
}
```

## (3) State in which cases you need to define the class constructor as private.  
- In case we wanted to use the constructor internally inside the class only.

## (4) (True or False) A subclass of a non‐abstract class must be non‐abstract, Explain.
- False. because abstract classes can contain concrete and abstract methods and can inherit non-abstract classes

## (5) (True or False) At least one method in an abstract class must be abstract, Explain.
- False. abstract class can be empty or can have all methods concrete

## (6) Suppose A is an inner class in class Test. What is the name(s) of the compiled file(s)? 
- Test$A.class
- Test.class

## (7) Which of the following statements is preferred to create a string "Welcome to Java"?
``` java
a. String s = "Welcome to Java";
b. String s = new String("Welcome to Java");
c. String s; s = "Welcome to Java";
d. String s; s = new String("Welcome to Java");
```
### "a" is preferred 
### reason: 
(a) is better than (b) because the string created in (a) is interned. Since strings are
immutable and are ubiquitous in programming, to improve efficiency and save
memory, the JVM uses a unique instance for string literals with the same
character sequence. Such an instance is called interned. The JVM (a) is simpler
than (c).
```
(b) simpler than (d) , (a) simpler than (c) , (a) is better than (b)
```

## (8) (True or False) A Java source file can include the definition of more than one public class.
- False. Java source file can include only one public class that have the same name as the .java file.

## (9) (True or False) All Java classes (except for class Object) directly inherit from one or more classes.
- False. Java doesn't allow multiple inheritance, so each class can "extends" one class only to avoid diamond problem and complexities.

## (10) (True or False) Java supports 4 different access modifiers for class members
- True. public, private, protected and no modifier or friendly modifier (Default modifier)














