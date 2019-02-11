package lesson1;

public class Airplane

{
	private int airplaneSpeed;
	private int airplaneWeight;
	private int passengerCompartment; //кількість пасажирських місць.
	private boolean airplaneDashboardLight; // підсвітка панелі приладів
	private boolean airplaneAutopilot;
	
	public int getAirplaneSpeed() {
		return airplaneSpeed;
	}
	
	public void setAirplaneSpeed(int airplaneSpeed) {
		this.airplaneSpeed = airplaneSpeed;
	}
	
	public int getAirplaneWeight() {
		return airplaneWeight;
	}
	
	public void setAirplaneWeight(int airplaneWeight) {
		this.airplaneWeight = airplaneWeight;
	}
	
	public int getPassengerCompartment() {
		return passengerCompartment;
	}
	
	public void setPassengerCompartment(int passengerCompartment) {
		this.passengerCompartment = passengerCompartment;
	}
	
	public boolean isAirplaneDashboardLight() {
		return airplaneDashboardLight;
	}
	
	public void setAirplaneDashboardLight(boolean airplaneDashboardLight) {
		this.airplaneDashboardLight = airplaneDashboardLight;
	}
	
	public boolean isAirplaneAutopilot() {
		return airplaneAutopilot;
	}
	
	public void setAirplaneAutopilot(boolean airplaneAutopilot) {
		this.airplaneAutopilot = airplaneAutopilot;
	}
	
	public void enableAutopilot() {
		setAirplaneAutopilot(true);
    }
	
	public void disableAutopilot() {
		setAirplaneAutopilot(false);
    }

	public void turnOnDashboardLights() {
    	setAirplaneDashboardLight(true);
    }
    
	private void turnOffDashboardLights() {
    	setAirplaneDashboardLight(false);
    }
	
	private void addBaggage() {
		setAirplaneWeight(getAirplaneWeight() + 10);
    }
	
	private void throwOutBaggage() {
		setAirplaneWeight(getAirplaneWeight() - 10);
    }
}