## Video 2.1 of Design Patterns Tutorial uses this code

# What is tight coupling
This scenario arises when a class is not desiged to be independent and assumes too many responsibilities, or when one concern is spread over many classes rather than having its own class.

The tight coupling between classes creates a ripple effect, which means when one class is changed it impacts too many other classes. A minor change in one class would need to modify and compile many other classes. 

# What is loose coupling
Loose coupling is achieved by means of a design that promotes single-responsibility and separation of concerns. If the only knowledge that class A has about class B, is what class B has exposed through its interface, then class A and class B are said to be loosely coupled.

A loosely-coupled class can be consumed and tested independently of other (concrete) classes.

Interfaces are a powerful tool to use for decoupling. Classes can communicate through interfaces rather than other concrete classes, and any class can be on the other end of that communication simply by implementing the interface.

# The fragile base-class problem
Base classes are considered fragile because you can modify a base class in a seemingly safe way, but this new behavior, when inherited by the derived classes, might cause the derived classes to malfunction. You can't tell whether a base-class change is safe simply by examining the base class's methods in isolation; you must look at (and test) all derived classes as well. Moreover, you must check all code that uses both base-class and derived-class objects too, since this code might also be broken by the new behavior. A simple change to a key base class can render an entire program inoperable.

### Learn Design Patterns with Java by Aseem Jain
This repository contains working project code used in video Course by Packt Publication with title "Learn Design Patterns with Java " authored by "Aseem Jain".

### Course link: 
https://www.packtpub.com/application-development/learn-design-patterns-java-9-video

### ![ http://in.linkedin.com/in/premaseem](https://github.com/premaseem/DesignPatternsJava9/blob/master/linkedin.png "http://in.linkedin.com/in/premaseem") Profile:  http://in.linkedin.com/in/premaseem

### Authors blog on design patterns:
https://premaseem.wordpress.com/category/computers/design-patterns/

### Software Design pattern community face book page:
https://www.facebook.com/DesignPatternGuru/
