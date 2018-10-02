package com.premaseem.client;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.Scanner;

import com.premaseem.strategy.AirthematicOperationStrategy;
import com.premaseem.strategy.impl.AdditionStrategy;
import com.premaseem.strategy.impl.MultiplicationStragegy;
import com.premaseem.strategy.impl.SubstractionStrategy;

public class ClientMain {

    public static void main (String[] args) {
        System.out.println("This is Calculator application designed using Strategy Pattern");
        System.out.println("Client has several Strategy which can be consumed at run time ");
        System.out.println("Please input 2 number for Strategic mathematical operation... ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number ");
        Integer num1 = scan.nextInt();
        System.out.println("Please enter second number");
        Integer num2 = scan.nextInt();
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");

        // Initially Strategy is null, it would be assigned at run time
        AirthematicOperationStrategy strategy = null;
        System.out.println("Please enter OPERATION CODE, on the run time strategy would be picked based on your choice of operation");
        String operationCode = scan.next();

        // Family of different algorithm is getting initialised here
        if (operationCode.contains("ADD")) {
            strategy = new AdditionStrategy();
        }

        if (operationCode.contains("SUB")) {
            strategy = new SubstractionStrategy();
        }

        if (operationCode.contains("MUL")) {
            strategy = new MultiplicationStragegy();
        }


        System.out.printf("You picked strategy as %s", operationCode);
        System.out.println();
        if (strategy != null) {
            // Operation remains same but implementation algo changes dynamically
            System.out.printf("Final result is %d", strategy.performOperation(num1, num2));
        } else {
            System.out.println("Invalid operation picked :-( ");
        }
        System.out.println();
        System.out.println("                 Thanks by Prem Aseem ");

    }
}
