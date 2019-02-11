package lesson1;

public class PC

{   
    private float pcRAMMemory;
    private float hardDriveMemory;
    private boolean discreteGraphicsCard; //тип даних - булева змінна, приймаюча значення true чи false.
    
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
	
	public boolean isDiscreteGraphicsCard() {
		return discreteGraphicsCard;
	}
	
	public void setDiscreteGraphicsCard(boolean discreteGraphicsCard) {
		this.discreteGraphicsCard = discreteGraphicsCard;
	}
	
	public void installApp () {
		setHardDriveMemory(getHardDriveMemory() - 50);
	}

	public void removeApp() {
		setHardDriveMemory(getHardDriveMemory() + 50);
	}

	public void launchApp() {
		setPcRAMMemory(getPcRAMMemory() - 25);
	}
    
	private void closeApp() {
		setPcRAMMemory(getPcRAMMemory() + 25);
	}
	
	private void enableDiskcreteGraphic() {
		setDiscreteGraphicsCard(true);
    }
	
	private void disableDiskcreteGraphic() {
		setDiscreteGraphicsCard(false);
    }
}