package me.premaseem.facade;

public class EntertainmentFacade {

	Nexus nexus = new Nexus();
	Amplifier amplifier = new Amplifier();
	Projector projector = new Projector();

	public void playMovie(String name) {
		nexus.downloadmedia(name);
		masterPowerOn();
		amplifier.attachAmplifierForHomeTheater();
		projector.adjustProjectorForMovie();
	}

	public void playMusic(String name) {
		nexus.downloadmedia(name);
		amplifier.powerOn();
		amplifier.attachAmplifierForMusic();
	}

	public void playGame(String name) {
		nexus.downloadmedia(name);
		masterPowerOn();
		amplifier.attachAmplifierForMusic();
		projector.adjustProjectorForGame();
	}

	public void masterPowerOff() {
		amplifier.powerOff();
		projector.powerOff();
	}

	public void masterPowerOn() {
		amplifier.powerOn();
		projector.powerOn();
	}
	
}
