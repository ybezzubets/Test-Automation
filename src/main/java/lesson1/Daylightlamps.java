package lesson1;

public class Daylightlamps

{   
	private int lampPartNumber; //номер партії, тип даних – цілі числа int.
	private int lampBrightness;
	private int lampColorTone; //колір світопередачі (теплий, холодний)
	private boolean wifiControl; //підтримка керування зі смартфону, тип даних - булева змінна, приймаюча значення true чи false.
	private boolean lampSafeMode;

	public int getLampPartNumber() {
		return lampPartNumber;
	}
	
	public void setLampPartNumber(int lampPartNumber) {
		this.lampPartNumber = lampPartNumber;
	}
	
	public int getLampBrightness() {
		return lampBrightness;
	}
	
	public void setLampBrightness(int lampBrightness) {
		this.lampBrightness = lampBrightness;
	}
	
	public int getLampColorTone() {
		return lampColorTone;
	}
	
	public void setLampColorTone(int lampColorTone) {
		this.lampColorTone = lampColorTone;
	}
	
	public boolean isWifiControl() {
		return wifiControl;
	}
	
	public void setWifiControl(boolean wifiControl) {
		this.wifiControl = wifiControl;
	}
	
	public boolean isLampSafeMode() {
		return lampSafeMode;
	}
	
	public void setLampSafeMode(boolean lampSafeMode) {
		this.lampSafeMode = lampSafeMode;
	}
	
	public void turnOn() {
		setLampBrightness(getLampBrightness() + 1);
	}

	public void turnOff() {
		setLampBrightness(getLampBrightness() - 1);
	}

	public void turnOnWarmTone() {
		setLampColorTone(getLampColorTone() + 50);
	}
	
	private void turnOnColdTone() {
		setLampColorTone(getLampColorTone() - 50);
	}

	private void enableEnergySafeMode() {
		setLampSafeMode(true);
	}
	
	private void disableEnergySafeMode() {
		setLampSafeMode(false);
	}
}