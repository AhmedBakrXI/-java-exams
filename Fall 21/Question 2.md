## 2.a)
``` java
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }


    @Override
    public void greets() {
        System.out.println("Meow");
    }
}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog dog){
        System.out.println("Woooof");
    }
}

class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }
    @Override
    public void greets(Dog dog) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog bigDog){
        System.out.println("Wooooooooow");
    }
}
```

## 2.b
![image](https://github.com/AhmedBakrXI/-java-exams/assets/114930002/3850bb9e-082a-4844-ace3-f55ee237a247)

``` java
        Cat cat1 = new Cat("C");
        cat1.greets(); // Meow
        Dog dog1 = new Dog("D");
        dog1.greets(); // Woof
        BigDog bigDog1 = new BigDog("Big");
        bigDog1.greets(); // Wooow

        // Using Polymorphism
        Animal animal1 = new Cat("C");
        animal1.greets(); // Meow
        Animal animal2 = new Dog("D");
        animal2.greets(); // Woof
        Animal animal3 = new BigDog("Big");
        animal3.greets(); // Wooow

        Animal animal4 = new Animal("A"); // Compile error

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        Cat cat2 = (Cat) animal2; // Runtime error

        dog2.greets(dog3); // Woooof
        dog3.greets(dog2); // Woooooow
        dog2.greets(bigDog2); // Woooof
        bigDog2.greets(dog2); // Woooooow
        bigDog2.greets(bigDog1); // Wooooooooow
        //for number (c) Run-time polymorphism is implemented through Method overriding, and Compile-time polymorphism is implemented through Method overloading and Operator overloading. 
 ```

## 2.c

``` java
Compile-time polymorphism:

Dog dog1 = new Dog("D");
dog1.greets(); // Woof

Dog dog2 = (Dog) animal2;
dog2.greets(dog3); // Woooof

...
Compile time Polymorphism example : as in one class there are two different implementations for the same method 
And what decides which to be called is the signature has been called with



Run-time polymorphism:

Animal animal1 = new Cat("C");
animal1.greets(); // Meow
// with 
Animal animal3 = new BigDog("Big");
animal3.greets(); // Wooow

also in 
dog2.greets(dog3); // Wooooof  as a dog greats a dog 
//with
bigDog2.greets(dog2); // Woooooow   as a bog dog greets a dog

...
So the same method greets(Dog d) has been overridden in two different classes .
 The decision on which implementation of the greets(Dog d) method to call is made at runtime based on the actual type of the object being referred to.


