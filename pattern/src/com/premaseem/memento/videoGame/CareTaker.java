package com.premaseem.memento.videoGame;
/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.HashMap;
import java.util.Map;

/*
 * Store Room
 */
public class CareTaker {
	Map<String, Memento> restorePoints = new HashMap<String, Memento>();
	Originator Originator = new Originator();
	
	public void saveGame(String restorePointName, GamePlayer player){
		Memento memento = Originator.saveMemento(player);
		restorePoints.put(restorePointName, memento);
	}
	
	public void restoreGame(String restorePointName, GamePlayer player){
		GamePlayer playerSnapShot = null;
		Memento memento = restorePoints.get(restorePointName);
		if(memento==null){
			System.out.printf(" %s Restore point name is no correct \n",restorePointName);
		}else{
			 playerSnapShot = memento.getPlayerSnapShot();
			 Originator.restorePlayerSnapshot(player, playerSnapShot);
			 System.out.printf(" %s Restore point is applied successfully \n ",restorePointName);
		}
	}
}