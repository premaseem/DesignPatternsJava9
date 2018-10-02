package com.premaseem.chainOfResponsibility.numberHandler;

public abstract class NumberChain {

	NumberChain nextHandler = null;

	public NumberChain setNextHandler(NumberChain nextHandler) {
		this.nextHandler = nextHandler;
		return this.nextHandler;
	}

	public abstract void handler(int requestNumber);

}

class PositiveNumberHandler extends NumberChain {

	@Override
	public void handler(int requestNumber) {
		if (requestNumber > 0) {
			System.out.println(this.getClass().getSimpleName() +" handled number " + requestNumber);
		}else{
			if(nextHandler!=null)
			nextHandler.handler(requestNumber);
		}
	}
}

class NegativeNumberHandler extends NumberChain {

	@Override
	public void handler(int requestNumber) {
		if (requestNumber < 0) {
			System.out.println(this.getClass().getSimpleName() +" handled number " + requestNumber);
		}else{
			if(nextHandler!=null)
			nextHandler.handler(requestNumber);
		}
	}
}

class ZeroNumberHandler extends NumberChain {

	@Override
	public void handler(int requestNumber) {
		if (requestNumber == 0) {
			System.out.println(this.getClass().getSimpleName() +" handled number " + requestNumber);
		}else{
			if(nextHandler!=null)
			nextHandler.handler(requestNumber);
		}
	}
}
