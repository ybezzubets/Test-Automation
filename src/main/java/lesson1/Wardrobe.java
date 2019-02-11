package lesson1;

public class Wardrobe

{   
	private int wardrobeHeight; //висота шафи, тип даних – цілі числа int.
	private int wardrobeWeight; //вага шафи, тип даних – цілі числа int.
	private boolean childrenDoorLock; //захиcт від вікриття дверей шафи дітьми, тип даних - булева змінна, приймаюча значення true чи false.
	private boolean wardrobeDoorLight;
	
	public int getWardrobeHeight() {
		return wardrobeHeight;
	}
	
	public void setWardrobeHeight(int wardrobeHeight) {
		this.wardrobeHeight = wardrobeHeight;
	}
	
	public int getWardrobeWeight() {
		return wardrobeWeight;
	}
	
	public void setWardrobeWeight(int wardrobeWeight) {
		this.wardrobeWeight = wardrobeWeight;
	}
	
	public boolean isChildrenDoorLock() {
		return childrenDoorLock;
	}
	
	public void setChildrenDoorLock(boolean childrenDoorLock) {
		this.childrenDoorLock = childrenDoorLock;
	}
	
	public boolean isWardrobeDoorLight() {
		return wardrobeDoorLight;
	}
	
	public void setWardrobeDoorLight(boolean wardrobeDoorLight) {
		this.wardrobeDoorLight = wardrobeDoorLight;
	}
    
	public void addСlothesToWardrobe() {
		setWardrobeWeight(getWardrobeWeight() - 5);
	}
    
	public void removeClothesFromWardrobe() {
		setWardrobeWeight(getWardrobeWeight() + 5);
	}
    
	public void enableDoorLight() {
    	setWardrobeDoorLight(true);
	}
	
	private void disableDoorLight() {
    	setWardrobeDoorLight(false);
	}
	
	private void enableChildrenDoorLock() {
    	setChildrenDoorLock(true);
	}
	
	private void disableChildrenDoorLock() {
    	setChildrenDoorLock(false);
	}
}