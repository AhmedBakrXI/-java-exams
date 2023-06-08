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











