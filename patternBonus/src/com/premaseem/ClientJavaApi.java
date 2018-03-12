package com.premaseem;
/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class ClientJavaApi {

    public static void main(String[] args) {

        // Created subject
        Subject subject = new Subject();

        // Created Observer
        Observer observer = new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("Observer notified with update: " + arg);
            }
        };

        // registered observer to the subject
        subject.addObserver(observer);

        System.out.println("Make text updates in subject: ");
        new Thread(subject).start();
    }
}

class Subject extends Observable implements Runnable {
    public void run() {

        // Every time whenever there is an update in subject,
        // observer will be notified
        while (true) {
            String update = new Scanner(System.in).next();
            setChanged();
            notifyObservers(update);
        }
    }
}

/** Lesson Learnt
 *
 *  1. Instead of creating our own observer and observable,
 *  using (java.util) Java api's  implementation of observer and observable
 *
 *  2. Java 9 has deprecated above apis, WHY ?
 *  answer is in link -https://stackoverflow.com/questions/46380073/observer-is-deprecated-in-java-9-what-should-we-use-instead-of-it
 * */
