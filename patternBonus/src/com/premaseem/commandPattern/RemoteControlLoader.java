package com.premaseem.commandPattern;

public class RemoteControlLoader {

	RemoteControl remote;

	public RemoteControlLoader(RemoteControl remote) {
		this.remote = remote;
	}

	public void load() {
		// Create instance of 3rd party devices
		Light light = new Light();
		Fan fan = new Fan();
		TV tv = new TV();
		
//		Command cmd =  new LightON(light);
		remote.setCommandOnSlot(0,new Undocommand(remote));	
		remote.setCommandOnSlot(1,new LightON(light));
		LightOFF lightOff = new LightOFF(light);
		remote.setCommandOnSlot(2,lightOff);
		FanOFF fanOff = new FanOFF(fan);
		remote.setCommandOnSlot(3,fanOff);
		remote.setCommandOnSlot(4,new FanLOW(fan));
		remote.setCommandOnSlot(5,new FanMEDIUM(fan));
		remote.setCommandOnSlot(6,new FanHIGH(fan));
		remote.setCommandOnSlot(7,new TVON(tv));
		TVOFF tvOff = new TVOFF(tv);
		remote.setCommandOnSlot(8,tvOff);
		remote.setCommandOnSlot(9,new TVChannelUP(tv));
		remote.setCommandOnSlot(10,new UndocommandMacro(remote));
		remote.setCommandOnSlot(11,new MasterOffcommand(lightOff,fanOff,tvOff));
		

	}
}

