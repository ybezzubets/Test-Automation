package lesson2;

public class AndroidSmartphone extends MobilePhones

{
	private String osVersion;
	private boolean support5gNetwork;

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public boolean isSupport5gNetwork() {
		return support5gNetwork;
	}

	public void setSupport5gNetwork(boolean support5gNetwork) {
		this.support5gNetwork = support5gNetwork;
	}

	public AndroidSmartphone(String osVersion, boolean support5gNetwork) {
		this.setOsVersion(osVersion);
		this.setSupport5gNetwork(support5gNetwork);	
	}
	
	public static void main(String[] args) {
		AndroidSmartphone galaxyS5 = new AndroidSmartphone("Lollipop", false);
		galaxyS5.fastInternet();
		AndroidSmartphone galaxyS6 = new AndroidSmartphone("Noughat", true);
		galaxyS6.fastInternet();
		AndroidSmartphone galaxyS7 = new AndroidSmartphone("Marshmallow", true);
		galaxyS7.fastInternet();
	}
		
	public void fastInternet() {
		setSupport5gNetwork(true);
		
	}
}
