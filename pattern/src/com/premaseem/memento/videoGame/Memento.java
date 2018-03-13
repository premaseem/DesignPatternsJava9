package com.premaseem.memento.videoGame;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public class Memento {
	private GamePlayer player;

	public Memento(GamePlayer player) {
		super();
		this.player = player;
	}
	
	GamePlayer getPlayerSnapShot(){
		return player;
	}

}