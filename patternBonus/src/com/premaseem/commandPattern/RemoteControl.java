package com.premaseem.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

	List<Command> slots = new ArrayList<Command>(15);
	Command lastCommand;
	List<Command> commandMacro = new ArrayList<Command>(3);
	
	public List<Command> getCommandMacro() {
		return commandMacro;
	}

	public Command getLastCommand() {
		return lastCommand;
	}

	public void setLastCommand(Command lastCommand) {
		this.lastCommand = lastCommand;
	}

	public void setCommandOnSlot( int i,Command cmd) {
		slots.add(i, cmd);
    }

	public void remoteButtonPress(int keyNumber){
		Command command = slots.get(keyNumber);
		command.execute();
		setLastCommand(command);
		commandMacro.add(command);
	}
}

