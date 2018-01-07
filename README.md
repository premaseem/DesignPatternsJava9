## Video 2.1 of Design Patterns Tutorial uses this code

# What is tight coupling
This scenario arises when a class is not desiged to be independent and assumes too many responsibilities, or when one concern is spread over many classes rather than having its own class.

The tight coupling between classes creates a ripple effect, which means when one class is changed it impacts too many other classes. A minor change in one class would need to modify and compile many other classes. 

# What is loose coupling
Loose coupling is achieved by means of a design that promotes single-responsibility and separation of concerns. If the only knowledge that class A has about class B, is what class B has exposed through its interface, then class A and class B are said to be loosely coupled.

A loosely-coupled class can be consumed and tested independently of other (concrete) classes.

Interfaces are a powerful tool to use for decoupling. Classes can communicate through interfaces rather than other concrete classes, and any class can be on the other end of that communication simply by implementing the interface.

# DesignPatternsJava9
This repo consists Gang of Four Design patterns code on Java 9. Each branch in the repository has code of 1 design pattern. Switch repository to try out different design patterns.
