package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(1000,1000);
		sleep(1000);
		driveDirect(0,0);
		sleep(1000);
		driveDirect(0,220);
		sleep(1000);
		driveDirect(1000,1000);
		sleep(1000);
		driveDirect(0,0);
		sleep(1000);
		driveDirect(220,0);
		sleep(1000);
		driveDirect(1000,1000);
		sleep(1000);
		driveDirect(0,0);
		sleep(1000);
		driveDirect(0,220);
		sleep(1000);
		driveDirect(1000,1000);
		sleep(1000);
		driveDirect(0,0);
		sleep(1000);
		driveDirect(220,0);
		sleep(1000);
		driveDirect(1000,1000);
		
	}

	public void loop() {
	
	}
}
