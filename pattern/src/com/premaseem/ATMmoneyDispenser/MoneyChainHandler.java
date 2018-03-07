package com.premaseem.ATMmoneyDispenser;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public abstract class MoneyChainHandler {
    MoneyChainHandler nextHandler = null;
    Integer noteDenomination = 0;

    public MoneyChainHandler setNextHandler (MoneyChainHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }

    public void handler (int dollarBill) {
        int notes = dollarBill / noteDenomination;
        int remainingAmount = dollarBill % noteDenomination;

        if (notes > 0) {
            System.out.printf("dispatched %d X %d = %d handled by %s \n", noteDenomination, notes, (noteDenomination * notes), this.getClass().getSimpleName());
        }
        if (nextHandler != null && remainingAmount > 0) {
            nextHandler.handler(remainingAmount);
        }
    }

}

class HundrenDollarHandler_100 extends MoneyChainHandler {
    public HundrenDollarHandler_100 (Integer noteDenomination) {
        this.noteDenomination = noteDenomination;
    }
}

class FiftyDollarHandler_50 extends MoneyChainHandler {
    public FiftyDollarHandler_50 (Integer noteDenomination) {
        this.noteDenomination = noteDenomination;
    }
}

class TenDollarHandler_10 extends MoneyChainHandler {
    public TenDollarHandler_10 (Integer noteDenomination) {
        this.noteDenomination = noteDenomination;
    }
}

class FiveDollarHandler_5 extends MoneyChainHandler {
    public FiveDollarHandler_5 (Integer noteDenomination) {
        this.noteDenomination = noteDenomination;
    }
}

class TwoDollarHandler_2 extends MoneyChainHandler {
    public TwoDollarHandler_2 (Integer noteDenomination) {
        this.noteDenomination = noteDenomination;
    }
}

class OneDollarHandler_1 extends MoneyChainHandler {
    public OneDollarHandler_1 (Integer noteDenomination) {
        this.noteDenomination = noteDenomination;
    }
}
