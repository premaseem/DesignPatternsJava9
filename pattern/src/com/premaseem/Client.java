package com.premaseem;

import java.util.Scanner;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Alexa welcomes you to Artificial intelligence app designed using Interpreter Design pattern :-) ");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        // User input block
        String repeatRunFlag = "yes";
        while (!repeatRunFlag.equalsIgnoreCase("no")) {
            System.out.println("\n Please ask your question related to voting ...");
            String question = scanner1.nextLine();

            // get Voting context
            Context votingContext = new VotingContext();

            // get Rules or grammar around context
            Expression ruleExpression = votingContext.getRuleExpression();

            // question is interpreted based on context and rules
            Boolean result = ruleExpression.interpret(question);

            // print Results
            String voteEligible = result ? "Yes ! can vote :-) ":"No ! cannot vote :-)";
            System.out.println("Alexa answered: " + voteEligible);

            // Ask from another questions
            System.out.println("Do you have another questions ? yes / no ");
            repeatRunFlag = scanner2.next();
        }
    }
}


