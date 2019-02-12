package lesson2;

public class WindowsSmartphone extends MobilePhones

{
	private int smartphoneVersionOS;
	private String smartphoneBrand;

	public String getSmartphoneBrand() {
		return smartphoneBrand;
	}
	
	public void setSmartphoneBrand(String smartphoneBrand) {
		this.smartphoneBrand = smartphoneBrand;
	}
	
	public int getSmartphoneVersionOS() {
		return smartphoneVersionOS;
	}
	
	public void setSmartphoneVersionOS(int smartphoneVersionOS) {
		this.smartphoneVersionOS = smartphoneVersionOS;
	}
	
	public WindowsSmartphone(int smartphoneVersionOS, String smartphoneBrand) {
		this.setSmartphoneVersionOS(smartphoneVersionOS);
		this.setSmartphoneBrand(smartphoneBrand);	
	}
	
	public static void main(String[] args) {
		WindowsSmartphone Nokia = new WindowsSmartphone(8, "Nokia");
		Nokia.upgradeFirmware();
		WindowsSmartphone Samsung = new WindowsSmartphone(7, "Samsung");
		Samsung.upgradeFirmware();
		WindowsSmartphone Siemens = new WindowsSmartphone(6, "Siemens");
		Siemens.upgradeFirmware();
		
	}

	public void upgradeFirmware() {
		setSmartphoneVersionOS(getSmartphoneVersionOS() + 1);
	}
}
