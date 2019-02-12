package lesson2;

public class MilitaryAircraft extends Airplane

{
	private int gunshipAmmo;
	private boolean gunshipAutoReloadingAmmo;
	
	public int getGunshipAmmo() {
		return gunshipAmmo;
	}
	
	public void setGunshipAmmo(int gunshipAmmo) {
		this.gunshipAmmo = gunshipAmmo;
	}

	public boolean isGunshipAutoReloadingAmmo() {
		return gunshipAutoReloadingAmmo;
	}

	public void setGunshipAutoReloadingAmmo(boolean gunshipAutoReloadingAmmo) {
		this.gunshipAutoReloadingAmmo = gunshipAutoReloadingAmmo;
	}
	
	public MilitaryAircraft(int gunshipAmmo, boolean passangerPlaneAutopilot) {
		this.setGunshipAmmo(gunshipAmmo);
		this.setGunshipAutoReloadingAmmo(gunshipAutoReloadingAmmo);	
	}
	
	public static void main(String[] args) {
		MilitaryAircraft F15 = new MilitaryAircraft(1000, false);
		F15.startGunShot();
		MilitaryAircraft F16 = new MilitaryAircraft(500, true);
		F16.startGunShot();
		MilitaryAircraft F22 = new MilitaryAircraft(600, false);
		F22.startGunShot();
	}	
		
	public void startGunShot() {
		setGunshipAmmo(getGunshipAmmo() - 100);
	}
}
