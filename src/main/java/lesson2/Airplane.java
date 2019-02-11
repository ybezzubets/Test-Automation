package lesson2;

public class Airplane 

{
	private int airplaneWeight;
	private boolean airplaneAutopilot;
	
	public int getAirplaneWeight() {
		return airplaneWeight;
	}
	
	public void setAirplaneWeight(int airplaneWeight) {
		this.airplaneWeight = airplaneWeight;
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
	
	public void addBaggage() {
		setAirplaneWeight(getAirplaneWeight() + 10);
    }
}
