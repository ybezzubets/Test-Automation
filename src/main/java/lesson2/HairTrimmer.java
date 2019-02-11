package lesson2;

public class HairTrimmer

{
	private int trimmerSpeed;
	private int trimmerWorkTime;
	
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
	
	public void startTrimmer() {
		setTrimmerSpeed(getTrimmerSpeed() + 1);
	}
	
	public void trimmerMaxSpeed() {
		setTrimmerWorkTime(getTrimmerWorkTime() - 20);
	}
}
