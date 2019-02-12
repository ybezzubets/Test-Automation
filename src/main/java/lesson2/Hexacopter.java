package lesson2;

public class Hexacopter extends Drone

{
	private int hexacopterFlightTime;
	private boolean hexacopterCamera;
	
	public int getHexacopterFlightTime() {
		return hexacopterFlightTime;
	}
	
	public void setHexacopterFlightTime(int hexacopterFlightTime) {
		this.hexacopterFlightTime = hexacopterFlightTime;
	}

	public boolean isHexacopterCamera() {
		return hexacopterCamera;
	}

	public void setHexacopterCamera(boolean hexacopterCamera) {
		this.hexacopterCamera = hexacopterCamera;
	}

	public Hexacopter(int hexacopterFlightTime, boolean hexacopterCamera) {
		this.setHexacopterFlightTime(hexacopterFlightTime);
		this.setHexacopterCamera(hexacopterCamera);	
	}
	
	public static void main(String[] args) {
		Quadcopter M1 = new Quadcopter(5, true);
		M1.startVideoRecording();
		Quadcopter M2 = new Quadcopter(6, false);
		M2.startVideoRecording();
		Quadcopter M3 = new Quadcopter(7, true);
		M3.startVideoRecording();
	}	
		
	public void startVideoRecording() {
		setHexacopterFlightTime(getHexacopterFlightTime() - 5);
	}
}
