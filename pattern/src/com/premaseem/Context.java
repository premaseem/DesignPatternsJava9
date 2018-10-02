package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
interface Context {
    Expression getRuleExpression ();
}

class VotingContext implements Context {

    @Override
    public Expression getRuleExpression () {
        Expression condition_1 = new TerminalExpression("citizen");
        Expression condition_2 = new TerminalExpression("18");
        return new AndExpression(condition_1, condition_2);
    }
}
