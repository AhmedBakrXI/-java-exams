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












