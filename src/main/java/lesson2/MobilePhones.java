package lesson2;

public class MobilePhones

{
	private int phoneProcessorTemperature;
	private boolean phoneCallRecorder;
	
	public int getPhoneProcessorTemperature() {
		return phoneProcessorTemperature;
	}
	
	public void setPhoneProcessorTemperature(int phoneProcessorTemperature) {
		this.phoneProcessorTemperature = phoneProcessorTemperature;
	}
	
	public boolean isPhoneCallRecorder() {
		return phoneCallRecorder;
	}
	
	public void setPhoneCallRecorder(boolean phoneCallRecorder) {
		this.phoneCallRecorder = phoneCallRecorder;
	}
	
	public void startCall() {
		setPhoneProcessorTemperature(getPhoneProcessorTemperature() + 5);
	}
	
	public void enableRecordCall() {
		setPhoneCallRecorder(true);
	}
}
