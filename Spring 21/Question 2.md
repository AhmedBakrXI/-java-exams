# @@ this answer is taken from an model answer for CSE 231 credit 2019
## 1) What is the difference in the equals method in the two implementations of MyInt class.
In (A), the method is overridden from the Object class. The new implementation is always going to be invoked
regardless of the passed object type.
In (B), the method is overloaded. Two implementations are now available:
1. The default implementation from the parent Object class which is called in case of an Object parameter.
2. The new implementation from the MyInt class which is called in case of a MyInt parameter.

## ⭐Extra Remark – Case A:
Calling the “equals()” method on a MyInt object stored in a reference of type Object and passing as a parameter an
object reference of type MyInt will call the new overridden implementation of the MyInt class.
``` java
public class Test {
public static void main(String[] args) {
MyInt a = new MyInt(1);
Object b = new MyInt(1);
System.out.println(b.equals(a)); // true
}
}
```
## ⭐Extra Remark – Case B:
Calling the “equals()” method on a MyInt object stored in a reference of type Object and passing as a parameter an
object reference of type MyInt will not call the overloaded function that receives a MyInt. It will instead force the
parameter to be casted to an Object and will then call the default equals() implementation in the Object class.
``` java 
public class Test {
public static void main(String[] args) {
MyInt a = new MyInt(1);
Object b = new MyInt(1);
System.out.println(b.equals(a)); // false
}
}
```
⭐ Why does Case B behave this way?
Signature binding is first performed by the compiler based on the reference type of b (Object).The compiler then
searches the reference type and all of its parents (only Object in our case) for the equals(MyInt Obj) function and it
only finds equals(Object obj). During dynamic binding, the JVM will start searching for the equals(Object obj) that the
compiler specified starting from the object type of b (MyInt), it will find equals(MyInt obj) which is incompatible, so it
will step up the inheritance chain to the Object class where if finds the equals(Object obj) method which is then
invoked.

## 2) What is the output of the following code segment in both cases (A) and (B)?
``` java
MyInt a = new MyInt(3);
MyInt b = new MyInt(3);
Object c = new MyInt(3);
System.out.println(a.equals(b));
System.out.println(a.equals(c));
```
|  Case (A): | Case (B):    | 
| :---:   | :---: |
| true | true   | 
| true   | false |

