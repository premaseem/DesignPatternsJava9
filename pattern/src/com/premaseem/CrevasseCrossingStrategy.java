package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
interface CrevasseCrossingStrategy {
    // Algorithm is collection of steps
    void crossCrevasse();
}

class JumpCrossStrategy implements CrevasseCrossingStrategy {

    // Different algorithm or steps are defined in each sub class
    @Override
    public void crossCrevasse () {
        System.out.println("Move 10 steps back");
        System.out.println("Start running as fast as possible");
        System.out.println("Jump over the Crevasse");
        System.out.println("Stop and Anchor your self");
    }
}

class RopeCrossStrategy implements CrevasseCrossingStrategy {

    // Different algorithm or steps are defined in each sub class
    @Override
    public void crossCrevasse () {
        System.out.println("Use Kernmantle rope");
        System.out.println("Tie rope with Anchor and through it on other side");
        System.out.println("Fix carabiner and fix it in rope");
        System.out.println("Cross using rope and untie yourself");
    }
}


