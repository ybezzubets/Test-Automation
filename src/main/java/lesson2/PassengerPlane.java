package lesson2;

public class PassengerPlane extends Airplane

{
	private int passengerCompartment;
	private boolean passangerPlaneAutopilot;
	
	public int getPassengerCompartment() {
		return passengerCompartment;
	}
	
	public void setPassengerCompartment(int passengerCompartment) {
		this.passengerCompartment = passengerCompartment;
	}

	public boolean isPassangerPlaneAutopilot() {
		return passangerPlaneAutopilot;
	}

	public void setPassangerPlaneAutopilot(boolean passangerPlaneAutopilot) {
		this.passangerPlaneAutopilot = passangerPlaneAutopilot;
	}

	public PassengerPlane(int passengerCompartment, boolean passangerPlaneAutopilot) {
		this.setPassengerCompartment(passengerCompartment);
		this.setPassangerPlaneAutopilot(passangerPlaneAutopilot);	
	}
	
	public static void main(String[] args) {
		PassengerPlane Boeing = new PassengerPlane(10, true);
		Boeing.enableAutoPilot();
		PassengerPlane Airbus = new PassengerPlane(10, true);
		Airbus.enableAutoPilot();
		PassengerPlane Antonov = new PassengerPlane(10, false);
		Antonov.enableAutoPilot();
	}	
		
	public void enableAutoPilot() {
		setPassangerPlaneAutopilot(true);
	}
}
