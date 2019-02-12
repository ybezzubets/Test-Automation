package lesson2;

public class Tricopter extends Drone

{
	private String droneBrand;
	private boolean droneGPS;
	
	public String getDroneBrand() {
		return droneBrand;
	}
	
	public void setDroneBrand(String droneBrand) {
		this.droneBrand = droneBrand;
	}

	public boolean isDroneGPS() {
		return droneGPS;
	}

	public void setDroneGPS(boolean droneGPS) {
		this.droneGPS = droneGPS;
	}

	public Tricopter(String droneBrand, boolean droneGPS) {
		this.setDroneBrand(droneBrand);
		this.setDroneGPS(droneGPS);	
	}
	
	public static void main(String[] args) {
		Tricopter SkyHero = new Tricopter("SkyHero", false);
		SkyHero.flightHome();
		Tricopter DJI = new Tricopter("DJI", false);
		DJI.flightHome();
		Tricopter Graupner = new Tricopter("Graupner", true);
		Graupner.flightHome();
		
	}	
		
	public void flightHome() {
		setDroneGPS(true);
	}	

}
