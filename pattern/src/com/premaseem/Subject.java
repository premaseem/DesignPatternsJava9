package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public abstract class Subject {

    abstract void acceptVisitingFacultytoTeach (VisitingFaculty visitingFaculty);

    void teach(){
           System.out.println("IN-HOUSE Faculty teaching "+ this.getClass().getSimpleName()+" subject");
       }
}

class Aviation extends Subject{

    @Override
    void acceptVisitingFacultytoTeach (VisitingFaculty visitingFaculty) {
        visitingFaculty.teach(this);
    }
}

class Computer extends Subject{

    @Override
    void acceptVisitingFacultytoTeach (VisitingFaculty visitingFaculty) {
        visitingFaculty.teach(this);
    }
}

class Maths extends Subject{

    @Override
    void acceptVisitingFacultytoTeach (VisitingFaculty visitingFaculty) {
        visitingFaculty.teach(this);
    }
}
