package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
driveDirect(500,500);
sleep(1000);
driveDirect(0,0);
sleep(1000);
driveDirect(0,240);
sleep(1000);
driveDirect(1000,1000);
sleep(1000);
driveDirect(0,0);
sleep(1000);
driveDirect(1000,1000);
sleep(1000);
driveDirect(0,0);
sleep(1000);
driveDirect(900,900);
sleep(1000);
driveDirect(0,0);
sleep(1000);
driveDirect(240,0);
sleep(1000);
driveDirect(1000,1000);
sleep(1000);
driveDirect(0,0);
sleep(1000);
driveDirect(100,100);
sleep(1000);
driveDirect(0,0);
sleep(1000);
driveDirect(240,0);
sleep(1000);
driveDirect(700,700);
sleep(1000);
driveDirect(0,0);
sleep(1000);
driveDirect(100,100);
sleep(1000);
driveDirect(0,240);
sleep(1000);
driveDirect(1000,1000);
sleep(1000);
driveDirect(0,240);
sleep(1000);
driveDirect(500,500);
sleep(1000);
driveDirect(0,0);
sleep(1000);
driveDirect(240,0);
sleep(1000);
driveDirect(200,200);
sleep(1000);
driveDirect(00,00);
sleep(1000);
driveDirect(0,240);
sleep(1000);
driveDirect(100,100);

	}

	public void loop() {

	}
}
