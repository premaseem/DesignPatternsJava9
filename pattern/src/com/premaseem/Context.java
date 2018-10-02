package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Context {

    CrevasseCrossingStrategy crevasseCrossingStrategy;

    public CrevasseCrossingStrategy getCrevasseCrossingStrategy (Integer distance) {
        if (distance < 3){
            crevasseCrossingStrategy = new JumpCrossStrategy();
        } else {
            crevasseCrossingStrategy = new RopeCrossStrategy();
        }
        return crevasseCrossingStrategy;
    }
}
