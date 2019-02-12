package lesson2;

public class ChromeBook

{
	private int osVersion;
	private boolean modem3g;
	public int getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(int osVersion) {
		this.osVersion = osVersion;
	}
	public boolean isModem3g() {
		return modem3g;
	}
	public void setModem3g(boolean modem3g) {
		this.modem3g = modem3g;
	}
	
	public ChromeBook(int osVersion, boolean modem3g) {
		this.setOsVersion(osVersion);
		this.setModem3g(modem3g);	
	}
	
	public static void main(String[] args) {
		ChromeBook PixelSlate = new ChromeBook(7, false);
		PixelSlate.flightMode();
		ChromeBook Pixelbook = new ChromeBook(8, true);
		Pixelbook.flightMode();
		ChromeBook AcerSpin = new ChromeBook(9, true);
		AcerSpin.flightMode();
		
	}	
		
	public void flightMode () {
		setModem3g(true);
	}
}
