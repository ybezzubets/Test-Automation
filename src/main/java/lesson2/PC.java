package lesson2;

public class PC

{
	private float pcRAMMemory;
    private float hardDriveMemory;
    
    public float getPcRAMMemory() {
		return pcRAMMemory;
	}
	
	public void setPcRAMMemory(float pcRAMMemory) {
		this.pcRAMMemory = pcRAMMemory;
	}
	
	public float getHardDriveMemory() {
		return hardDriveMemory;
	}
	
	public void setHardDriveMemory(float hardDriveMemory) {
		this.hardDriveMemory = hardDriveMemory;
	}
	
	public PC() {
		
	}
	
	public void installApp () {
		setHardDriveMemory(getHardDriveMemory() - 50);
	}
	
	public void launchApp() {
		setPcRAMMemory(getPcRAMMemory() - 25);
	}

}
