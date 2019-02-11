package lesson1;

public class SnowRemovalMachines

{   
	private int machineSpeeds;
	private int machineWeight;
	private boolean machineHeadLight;
	private boolean machineElectricStart;
	
	public int getMachineSpeeds() {
		return machineSpeeds;
	}
	
	public void setMachineSpeeds(int machineSpeeds) {
		this.machineSpeeds = machineSpeeds;
	}
	
	public int getMachineWeight() {
		return machineWeight;
	}
	
	public void setMachineWeight(int machineWeight) {
		this.machineWeight = machineWeight;
	}
	
	public boolean isMachineHeadLight() {
		return machineHeadLight;
	}
	
	public void setMachineHeadLight(boolean machineHeadLight) {
		this.machineHeadLight = machineHeadLight;
	}
	
	public boolean isMachineElectricStart() {
		return machineElectricStart;
	}
    
	public void setMachineElectricStart(boolean machineElectricStart) {
		this.machineElectricStart = machineElectricStart;
	}
	
	public void startCleaningSnow() {
		setMachineSpeeds(getMachineSpeeds() + 1);
	}

	public void stopCleaningSnow() {
		setMachineSpeeds(getMachineSpeeds() - 1);
	}
    
	public void turnOnHeadlight() {
		setMachineHeadLight(true);
	}
	
	private void turnOffHeadlight() {
		setMachineHeadLight(false);
	}
	
	private void startElectricRun() {
		setMachineElectricStart(true);
	}
	
	private void stopElectricRun() {
		setMachineElectricStart(false);
	}
}