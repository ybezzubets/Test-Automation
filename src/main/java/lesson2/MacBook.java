package lesson2;

public class MacBook

{
	private String macBookName;
	private boolean dualBoot;
	
	public String getMacBookName() {
		return macBookName;
	}
	
	public void setMacBookName(String macBookName) {
		this.macBookName = macBookName;
	}
	
	public boolean isDualBoot() {
		return dualBoot;
	}
	
	public void setDualBoot(boolean dualBoot) {
		this.dualBoot = dualBoot;
	}
	
	public MacBook(String macBookName, boolean dualBoot) {
		this.setMacBookName(macBookName);
		this.setDualBoot(dualBoot);	
	}
	
	public static void main(String[] args) {
		MacBook Air = new MacBook("Air", true);
		Air.bootWindows();
		MacBook Pro = new MacBook("Pro", true);
		Pro.bootWindows();
		MacBook Mini = new MacBook("Mini", true);
		Mini.bootWindows();
		
	}	
		
	public void bootWindows () {
		setDualBoot(true);
	}
}
