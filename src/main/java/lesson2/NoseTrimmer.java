package lesson2;

public class NoseTrimmer extends HairTrimmer

{
	private int noseTrimmerSpeed;
	private int noseTrimmerWorkTime;
	
	public int getNoseTrimmerSpeed() {
		return noseTrimmerSpeed;
	}
	
	public void setNoseTrimmerSpeed(int noseTrimmerSpeed) {
		this.noseTrimmerSpeed = noseTrimmerSpeed;
	}

	public int getNoseTrimmerWorkTime() {
		return noseTrimmerWorkTime;
	}

	public void setNoseTrimmerWorkTime(int noseTrimmerWorkTime) {
		this.noseTrimmerWorkTime = noseTrimmerWorkTime;
	}

	public NoseTrimmer(int noseTrimmerSpeed, int noseTrimmerWorkTime) {
		this.setNoseTrimmerSpeed(noseTrimmerSpeed);
		this.setNoseTrimmerWorkTime(noseTrimmerWorkTime);	
	}
	
	public static void main(String[] args) {
		NoseTrimmer abc1 = new NoseTrimmer(10, 12);
		abc1.minSpeed();
		NoseTrimmer abc2 = new NoseTrimmer(10, 12);
		abc2.minSpeed();
		NoseTrimmer abc3 = new NoseTrimmer(10, 12);
		abc3.minSpeed();
	}	
		
	public void minSpeed() {
		setNoseTrimmerWorkTime(getNoseTrimmerWorkTime() + 5);
	}
}