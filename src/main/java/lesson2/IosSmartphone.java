package lesson2;

public class IosSmartphone extends MobilePhones

{
	private int iosVersion;
	private boolean phoneNFC;
	
	public int getIosVersion() {
		return iosVersion;
	}
	public void setIosVersion(int iosVersion) {
		this.iosVersion = iosVersion;
	}
	public boolean isPhoneNFC() {
		return phoneNFC;
	}
	public void setPhoneNFC(boolean phoneQiCharghe) {
		this.phoneNFC = phoneQiCharghe;
	}
	
	public IosSmartphone(int iosVersion, boolean phoneNFC) {
		this.setIosVersion(iosVersion);
		this.setPhoneNFC(phoneNFC);	
	}
	
	public static void main(String[] args) {
		IosSmartphone Iphone5 = new IosSmartphone(1, false);
		Iphone5.paymentNFC();
		IosSmartphone Iphone6 = new IosSmartphone(11, true);
		Iphone6.paymentNFC();
		IosSmartphone Iphone7 = new IosSmartphone(12, true);
		Iphone7.paymentNFC();
	}

	public void paymentNFC() {
		setPhoneNFC(true);
	}
}
