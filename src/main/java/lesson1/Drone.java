package lesson1;

public class Drone

{
	private int droneNumberOfEngines; //кількість двигунів, тип даних – цілі числа int.
	private int droneWeight; //вага дрону, тип даних – цілі числа int
	private int droneFlightTime; //тривалість польоту від одного заряду.
	private boolean smartphoneControl; //підтримка керування дроном зі смартфону, тип даних - булева змінна, приймаюча значення true чи false.
    private boolean emergencyLanding; //режим аварійної посадки.
    
	public int getDroneNumberOfEngines() {
		return droneNumberOfEngines;
	}
	
	public void setDroneNumberOfEngines(int droneNumberOfEngines) {
		this.droneNumberOfEngines = droneNumberOfEngines;
	}
	
	public int getDroneWeight() {
		return droneWeight;
	}
	
	public void setDroneWeight(int droneWeight) {
		this.droneWeight = droneWeight;
	}
	
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
	
	public boolean isEmergencyLanding() {
		return emergencyLanding;
	}
	
	public void setEmergencyLanding(boolean emergencyLanding) {
		this.emergencyLanding = emergencyLanding;
	}
	
	public void startVideoRecording() {
		setDroneFlightTime(getDroneFlightTime() - 5);
    }
    
	public void stopVideoRecording() {
		setDroneFlightTime(getDroneFlightTime() + 5);
    }
    
	public void activateEmergencyLanding() {
		setEmergencyLanding(true);
    }
	
	private void disableEmergencyLanding() {
		setEmergencyLanding(false);
    }
	
	private void enableSmartControl() {
		setSmartphoneControl(true);
    }

	private void disableSmartControl() {
		setSmartphoneControl(false);
    }
}