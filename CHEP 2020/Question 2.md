# السؤال ده لسه متحلش  
## 2.a)
``` java
public class Car {
    private final Engine engine;

    public Car() {
        engine = new Engine();
    }
}

class Engine {
}

//////////////////////////////////////////////////////////////
public class Team {
    private List players;

    public Team() {
        players = new ArrayList();
    }
}

class Player {
}

```
### i. What is the relationship between class Car and class Engine? (2 points)
-   Composition
### ii. What is the relationship between class Team and class Player? (2 points)
-   Aggregation
### iii. Draw the UML class diagram for the given code. 
***Note: I forgot the constructors in the UML 🙂💔***
![image](https://github.com/AhmedBakrXI/-java-exams/assets/114930002/f2e67bb8-1914-4686-aa4b-7c0475af8230)
![image](https://github.com/AhmedBakrXI/-java-exams/assets/114930002/03fafe5c-c05a-430c-8288-58417c42d286)



## 2.b) 
Consider this UML class diagram showing part of a program to manage the membership information for a
professional society:
### i. Write a Java version of class ManagementCttee assuming it has this constructor: (6 points)
public ManagementCttee()
### ii. Class Member is an abstract class. Explain the role of an abstract class. (3 points)
### iii. Write a Java version of class StandardMember assuming it has this constructor:
public StandardMember(String name, String address)
and the standard membership fee is fixed at L.E. 50. (6 points)
![image](https://github.com/AhmedBakrXI/-java-exams/assets/114930002/9f7ba6ba-0454-4c2f-8374-8b0f75c80ce1)









