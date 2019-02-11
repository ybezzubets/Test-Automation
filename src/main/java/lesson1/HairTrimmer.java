package lesson1;

public class HairTrimmer

{   
	private int trimmerCuttingLengths;
	private int trimmerSpeed;
	private int trimmerWorkTime;
	private boolean trimmerBattery;
	
	public int getTrimmerCuttingLengths() {
		return trimmerCuttingLengths;
	}
	
	public void setTrimmerCuttingLengths(int trimmerCuttingLengths) {
		this.trimmerCuttingLengths = trimmerCuttingLengths;
	}
	
	public int getTrimmerSpeed() {
		return trimmerSpeed;
	}
	
	public void setTrimmerSpeed(int trimmerSpeed) {
		this.trimmerSpeed = trimmerSpeed;
	}
	
	public int getTrimmerWorkTime() {
		return trimmerWorkTime;
	}
	
	public void setTrimmerWorkTime(int trimmerWorkTime) {
		this.trimmerWorkTime = trimmerWorkTime;
	}
    
	public boolean isTrimmerBattery() {
		return trimmerBattery;
	}
	
	public void setTrimmerBattery(boolean trimmerBattery) {
		this.trimmerBattery = trimmerBattery;
	}
	
	public void startTrimmer() {
		setTrimmerSpeed(getTrimmerSpeed() + 1);
	}

	public void stopTrimmer() {
		setTrimmerSpeed(getTrimmerSpeed() - 1);
	}
    
	public void trimmerMaxSpeed() {
		setTrimmerWorkTime(getTrimmerWorkTime() - 20);
	}
	
	private void trimmerMinSpeed() {
		setTrimmerWorkTime(getTrimmerWorkTime() + 20);
	}
	
	private void installSmallerLengths() {
		setTrimmerCuttingLengths(getTrimmerCuttingLengths() - 1); 
	}
	
	private void installLargeLengths() {
		setTrimmerCuttingLengths(getTrimmerCuttingLengths() + 1); 
	}
}