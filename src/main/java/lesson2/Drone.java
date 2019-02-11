package lesson2;

public class Drone

{
	private int droneFlightTime;
	private boolean smartphoneControl;
	
	public int getDroneFlightTime() {
		return droneFlightTime;
	}
	
	public void setDroneFlightTime(int droneFlightTime) {
		this.droneFlightTime = droneFlightTime;
	}
	
	public boolean isSmartphoneControl() {
		return smartphoneControl;
	}
	
	public void setSmartphoneControl(boolean smartphoneControl) {
		this.smartphoneControl = smartphoneControl;
	}
	
	public void startVideoRecording() {
		setDroneFlightTime(getDroneFlightTime() - 5);
	}
	
	public void enableSmartControl() {
		setSmartphoneControl(true);
	}
}
