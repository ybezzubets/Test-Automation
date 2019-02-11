package lesson1;

public class MobilePhones

{
	private int phoneIssueDate; //дата випуску, тип даних – цілі числа int.
	private int phoneProcessorTemperature; //вага телефону, тип даних – цілі числа int.
	private boolean qiWirelessCharge;  //підтримка бездротвої зарядки телефонк, тип даних - булева змінна, приймаюча значення true чи false.
    private boolean phoneNFCPayment;
    private boolean phoneCallRecorder;
	
    public int getPhoneIssueDate() {
		return phoneIssueDate;
	}
	
	public void setPhoneIssueDate(int phoneIssueDate) {
		this.phoneIssueDate = phoneIssueDate;
	}
	
	public int getPhoneProcessorTemperature() {
		return phoneProcessorTemperature;
	}
	
	public void setPhoneProcessorTemperature(int phoneProcessorTemperature) {
		this.phoneProcessorTemperature = phoneProcessorTemperature;
	}
    
	public boolean isQiWirelessCharge() {
		return qiWirelessCharge;
	}
	
	public void setQiWirelessCharge(boolean qiWirelessCharge) {
		this.qiWirelessCharge = qiWirelessCharge;
	}
	
	public boolean isPhoneNFCPayment() {
		return phoneNFCPayment;
	}
	
	public void setPhoneNFCPayment(boolean phoneNFCPayment) {
		this.phoneNFCPayment = phoneNFCPayment;
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

	public void stopCall() {
		setPhoneProcessorTemperature(getPhoneProcessorTemperature() - 5);
	}
    
	public void enablePhonePay() {
		setPhoneNFCPayment(true);
    }
	
	private void disablePhonePay() {
		setPhoneNFCPayment(false);
    }
	
	private void enableRecordCall() {
		setPhoneCallRecorder(true);
    }
	
	private void disableRecordCall() {
		setPhoneCallRecorder(false);
    }
}