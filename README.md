# Video 1.9: Fundamental concepts of code reusability
The code in this branch was used in video 1.9 of video course Design patterhs with Java 9. 
This brach contains code to demonstrate fundamental concepts of code reusability. 

## What are Software Design Principles?
Software design principles represent a set of guidelines that helps us to avoid having a bad design.
there are 3 important characteristics of a bad design that should be avoided:

* Rigidity - It is hard to change because every change affects too many other parts of the system.
* Fragility - When you make a change, unexpected parts of the system break.
* Immobility - It is hard to reuse in another application because it cannot be disentangled from the current application.

## Is your code Solid ? 
S.O.L.I.D is an acronym for the first five object-oriented design(OOD) principles
S.O.L.I.D stands for:
* S - Single-responsiblity principle
* O - Open-closed principle
* L - Liskov substitution principle
* I - Interface segregation principle
* D - Dependency Inversion Principle

### Single Responsibility Principle
A class should have only one reason to change.
In this context a responsibility is considered to be one reason to change. This principle states that if we have 2 reasons to change for a class, we have to split the functionality in two classes. When we need to make a change in a class having more responsibilities the change might affect the other functionality of the classes.
Code Example: Base class is doing too many things, the salary calculator should be a class in itself. 

### Open Close Principle
Software entities like classes, modules and functions should be open for extension but closed for modifications.
You can consider it when writing your classes to make sure that when you need to extend their behavior you dont have to change the class but to extend it. 

When referring to the classes Open Close Principle can be ensured by use of Abstract Classes or interface and concrete classes for implementing their behavior. This will enforce having Concrete Classes extending Abstract Classes instead of changing them. Some particular cases of this are Template Pattern and Strategy Pattern.

Example: To get desired behavior from a library you consume (if that library follows open close principal), instead of making modifcation in its base class you should be able extend or subclass it and apply your logic to get desired output. 
Code Example: Base class is doing too many things, the salary calculator should be a class in itself.


### Interface Segregation Principle
Clients should not be forced to depend upon interfaces that they don't use.
This principle teaches us to take care how we write our interfaces. When we write our interfaces we should take care to add only methods that should be there. If we add methods that should not be there the classes implementing the interface will have to implement those methods as well. For example if we create an interface called Worker and add a method lunch break, all the workers will have to implement it. What if the worker is a robot?
As a conclusion Interfaces containing methods that are not specific to it are called polluted or fat interfaces. We should avoid them.
Code Example: Weapon allowance in our base class. 


### Liskov's Substitution Principle
Derived types must be completely substitutable for their base types.
This principle is just an extension of the Open Close Principle in terms of behavior meaning that we must make sure that new derived classes are extending the base classes without changing their behavior. The new derived classes should be able to replace the base classes without any change in the code.

### Dependency Inversion Principle
Abstractions should not depend on details. Details should depend on abstractions.
Dependency Inversion Principle states that we should decouple high level modules from low level modules, introducing an abstraction layer between the high level classes and low level classes. 

By applying the Dependency Inversion the modules can be easily changed by other modules just by changing the dependency module. 
Factories and Abstract Factories can be used as dependency frameworks, but there are specialized frameworks for that, known as Inversion of Control Container.

code Example: simplest example is hibernate which is nothing but implementation of JPA interface. 

JPA itself is just a specification, not a product, it cannot perform persistence or anything else by itself. JPA is just a set of interfaces, and requires an implementation. 
Hibernate is not coupled becuase of JPA interface and it can be seemlesly replaced by any other product or JPA provide which implements JPA Interface :-) 

### DRY 
Don’t Repeat Yourself is a software development principle, the main aim of which is to reduce repetition of code.

### WET
Write Every Time is a cheeky abbreviation to mean the opposite i.e. code that doesn’t adhere to DRY principle.

##### Advantages of DRY
* Maintainability
If password for data base connection changes, then you have to make change only at one place. 

* Reuse
DRY inherently promotes reuse of code because we are merging 2 or more instances of repeating code into a single block of code. Reusable code pays of in the long run as it speeds development time.

* Cost
More code costs more. More code takes more people more time to maintain and to address bugs.

* Testing
If code is not repeated, you just have to test one main path. Of course, different behaviors still need to be tested.

### Learn Design Patterns with Java by Aseem Jain
This repository contains working project code used in video Course by Packt Publication with title "Learn Design Patterns with Java " authored by "Aseem Jain".

### Course link: 
https://www.packtpub.com/application-development/learn-design-patterns-java-9-video

### ![ http://in.linkedin.com/in/premaseem](https://github.com/premaseem/DesignPatternsJava9/blob/master/linkedin.png "http://in.linkedin.com/in/premaseem") Profile:  http://in.linkedin.com/in/premaseem

### Authors blog on design patterns:
https://premaseem.wordpress.com/category/computers/design-patterns/

### Software Design pattern community face book page:
https://www.facebook.com/DesignPatternGuru/
