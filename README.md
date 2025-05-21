# workbook-6
Advanced OOP
# Interface
  An interface is a blueprint of a class. It's a fundamental concept in Object-Oriented Programming (OOP) that helps achieve abstraction and multiple inheritance 

 ## When a class "implements" an interface, it essentially signs an agreement to provide concrete implementations for all the methods declared in that interface
 <!-- Example -->

 public interface Drivable {
    void drive();
    void turn(String direction);
    int getSpeed();
}

<!-- Implement and make write logic in method -->

public class Car implements Drivable {
    private int currentSpeed;

    @Override
    public void drive() {
        System.out.println("Car is driving.");
        currentSpeed = 60;
    }

    @Override
    public void turn(String direction) {
        System.out.println("Car is turning " + direction + ".");
    }

    @Override
    public int getSpeed() {
        return currentSpeed;
    }
}

1) Abstract Type: An interface is an abstract type. You cannot directly create an object (instantiate) of an interface
2) Contains Abstract Methods (Historically): Traditionally, interfaces could only contain abstract methods (methods without a body) and public static final constants

All methods in an interface (before default/static methods) are implicitly public abstract.
All variables (constants) in an interface are implicitly public static final.

<!-- Class can have 2 or more interfaces implemented -->
public class AmphibiousVehicle implements Drivable, Swimmable {
    // ... must implement methods from both Drivable and Swimmable
}

Interfaces can extend other interfaces:

public interface Vehicle extends Drivable, Swimmable {
    // Can add more methods specific to a general vehicle
}

## Important
In an interface, when we use the extend keyword, we can inherit multiple interfaces. And on the other hand, when a class implements and interface, it can implement 2 or more.

Also when a class extends another class, it can extend only one class


### Why Use Interfaces (Benefits):

Achieve Abstraction: Interfaces allow you to define a common behavior without revealing the underlying implementation details. This promotes loose coupling, where components depend on abstract contracts rather than concrete implementations.

1) Support Multiple Inheritance of Behavior: While Java classes can only inherit from one superclass, they can implement multiple interfaces. This allows a class to inherit a "type" or "contract" from multiple sources, providing more flexibility in design.

2) Define Contracts/APIs: Interfaces are excellent for defining Application Programming Interfaces (APIs). They establish a clear contract for how different parts of a system (or different systems) should interact.

3) Promote Polymorphism: You can write code that operates on interface types, rather than specific class types. This makes your code more flexible and reusable. For example, a method could accept a List (an interface) as an argument, rather than specifically an ArrayList or LinkedList, allowing it to work with any list implementation.
4) Enable Callback Mechanisms: Interfaces are often used to implement callback mechanisms, where one object can notify another object of an event by calling a method defined in an interface that the second object implements.
5) Framework Design: Many Java frameworks (like the Java Collections Framework, JDBC, etc.) heavily rely on interfaces to define standard behaviors and allow for different implementations.



