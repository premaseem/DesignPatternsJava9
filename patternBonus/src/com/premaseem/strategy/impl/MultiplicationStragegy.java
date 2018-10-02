package com.premaseem.strategy.impl;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import com.premaseem.strategy.AirthematicOperationStrategy;

public class MultiplicationStragegy implements AirthematicOperationStrategy {

	@Override
	public Integer performOperation(Integer num1, Integer num2) {
		return num1 * num2;
	}

}
