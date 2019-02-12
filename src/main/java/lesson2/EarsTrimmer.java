package lesson2;

public class EarsTrimmer extends HairTrimmer

{
	private int trimmerCuttingLengths;
	private boolean trimmerBattery;

	public int getTrimmerCuttingLengths() {
		return trimmerCuttingLengths;
	}

	public void setTrimmerCuttingLengths(int trimmerCuttingLengths) {
		this.trimmerCuttingLengths = trimmerCuttingLengths;
	}

	public boolean isTrimmerBattery() {
		return trimmerBattery;
	}

	public void setTrimmerBattery(boolean trimmerBattery) {
		this.trimmerBattery = trimmerBattery;
	}
	
	public EarsTrimmer(int trimmerCuttingLengths, boolean trimmerBattery) {
		this.setTrimmerCuttingLengths(trimmerCuttingLengths);
		this.setTrimmerBattery(trimmerBattery);	
	}
	
	public static void main(String[] args) {
		EarsTrimmer ears1 = new EarsTrimmer(10, true);
		ears1.installSmallerLengths();
		EarsTrimmer ears2 = new EarsTrimmer(10, true);
		ears2.installSmallerLengths();
		EarsTrimmer ears3 = new EarsTrimmer(10, false);
		ears3.installSmallerLengths();
	}	
		
	public void installSmallerLengths() {
		setTrimmerCuttingLengths(getTrimmerCuttingLengths() - 1);
	}
}
