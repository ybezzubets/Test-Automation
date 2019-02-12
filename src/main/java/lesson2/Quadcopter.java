package lesson2;

public class Quadcopter extends Drone

{
	private int droneSpeed;
	private boolean droneCamera;
	
	public int getDroneSpeed() {
		return droneSpeed;	
	}
	
	public void setDroneSpeed(int droneSpeed) {
		this.droneSpeed = droneSpeed;	
	}
	
	public boolean isDroneCamera() {
		return droneCamera;		
	}
	
	public void setDroneCamera(boolean droneCamera) {
		this.droneCamera = droneCamera;
	}

	public Quadcopter(int droneSpeed, boolean droneCamera) {
		this.setDroneSpeed(droneSpeed);
		this.setDroneCamera(droneCamera);	
	}
	
	public static void main(String[] args) {
		Quadcopter SkyHero = new Quadcopter(5, true);
		SkyHero.maxSpeed();
		Quadcopter DJI = new Quadcopter(6, false);
		DJI.maxSpeed();
		Quadcopter Graupner = new Quadcopter(7, true);
		Graupner.maxSpeed();
	}	
		
	public void maxSpeed() {
		setDroneSpeed(getDroneSpeed() + 5);
	}
}
