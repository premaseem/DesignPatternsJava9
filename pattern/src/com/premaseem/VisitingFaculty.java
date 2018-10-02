package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public interface VisitingFaculty {
    void teach (Aviation aviation);
    void teach (Computer computer);
    void teach (Maths maths);
}

class ProfAseem implements VisitingFaculty{

    @Override
    public void teach (Aviation aviation) {
        System.out.println("Visiting Faculty teaching Aviation subject");
    }

    @Override
    public void teach (Computer computer) {
        System.out.println("Visiting Faculty teaching Computer subject");
    }

    @Override
    public void teach (Maths maths) {
        System.out.println("Visiting Faculty teaching Maths subject");
    }
}

class AnyOtherProfessor implements VisitingFaculty{

    @Override
    public void teach (Aviation aviation) {
        System.out.println("Visiting Faculty teaching Aviation subject");
    }

    @Override
    public void teach (Computer computer) {
        System.out.println("Visiting Faculty teaching Computer subject");
    }

    @Override
    public void teach (Maths maths) {
        System.out.println("Visiting Faculty teaching Maths subject");
    }
}
