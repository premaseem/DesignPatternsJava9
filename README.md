# What is Composite Design Pattern 
* Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy.
* This pattern creates a class that contains group of its own objects.

## Diagram
![Diagram](https://github.com/premaseem/DesignPatternsJava9/blob/composite-pattern/diagrams/Composite%20Design%20Pattern%20class%20diagram.png "Diagram")

![Diagram](https://github.com/premaseem/DesignPatternsJava9/blob/composite-pattern/diagrams/Composite%20design%20pattern%20tree%20example.png "Diagram")

![Diagram](https://github.com/premaseem/DesignPatternsJava9/blob/composite-pattern/diagrams/composite%20sequence%20diagram.png "Diagram")

### When to use Composite Design Pattern 
Composite Pattern should be used when clients need to ignore the difference between compositions of objects and individual objects and needs to handles them in the same way.

### The Composite Pattern has four participants:
* Component – Component declares the interface for objects in the composition and for accessing and managing its child components. It also implements default behavior for the interface common to all classes as appropriate.
* Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
* Composite – Composite stores child components and implements child related operations in the component interface.
* Client – Client manipulates the objects in the composition through the component interface.

### Learn Design Patterns with Java by Aseem Jain
This repository contains working project code used in video Course by Packt Publication with title "Learn Design Patterns with Java " authored by "Aseem Jain".

### Course link: 
https://www.packtpub.com/application-development/learn-design-patterns-java-9-video

### ![ http://in.linkedin.com/in/premaseem](https://github.com/premaseem/DesignPatternsJava9/blob/master/linkedin.png "http://in.linkedin.com/in/premaseem") Profile:  http://in.linkedin.com/in/premaseem

### Authors blog on design patterns:
https://premaseem.wordpress.com/category/computers/design-patterns/

### Software Design pattern community face book page:
https://www.facebook.com/DesignPatternGuru/

### Note: 
* This code base will work on Java 9 and above versions. 
* `diagrams` folders carry UML diagrams.
* `pattern` folder has code of primary example. 
* `patternBonus` folder has code of secondary or bonus example.
