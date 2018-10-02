package me.premaseem.facade;

public class EntertainmentDevice {

}

class Nexus {
	public void downloadmedia(String name) {
		System.out.println("Searching the media ");
		System.out.println("Making online payment ");
		System.out.println("downloaded from Nexus " + name);
	}
}

class Amplifier {

	void powerOn() {
		System.out.println("Power on Amplifier");
	}

	void powerOff() {
		System.out.println("power Off Amplifer ");
	}

	void attachAmplifierForMusic() {
		System.out.println("Attaching music amplification");
	}

	void attachAmplifierForHomeTheater() {
		System.out.println("Attaching movie amplification ");
	}
}

class Projector {

	void powerOn() {
		System.out.println("Power on Projector");
	}

	void powerOff() {
		System.out.println("power Off Projector ");
	}

	void adjustProjectorForMovie() {
		System.out.println("Attaching home theater mode");
	}

	void adjustProjectorForGame() {
		System.out.println("Attaching game console ");
	}
}
