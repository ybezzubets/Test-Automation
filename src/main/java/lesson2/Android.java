package lesson2;

public class Android extends MobilePhones

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

}
