package lesson1;

public class Food

{   
	private int foodProteins; //вміст білків, тип даних – цілі числа int.
	private int foodFats; //вміст жирів, тип даних – цілі числа int.
	private int foodShelfLife; //термін придатності.
	private boolean rawFood;  //атрибут можливості вживання в сирому вигляді, тип даних - булева змінна, приймаюча значення true чи false.
	private boolean foodGlutenFree; //атрибут наявності глютену в їжі, тип даних - булева змінна, приймаюча значення true чи false.
	
	public int getFoodProteins() {
		return foodProteins;
	}
	
	public void setFoodProteins(int foodProteins) {
		this.foodProteins = foodProteins;
	}
	
	public int getFoodFats() {
		return foodFats;
	}
	
	public void setFoodFats(int foodFats) {
		this.foodFats = foodFats;
	}
	
	public int getFoodShelfLife() {
		return foodShelfLife;
	}
	
	public void setFoodShelfLife(int foodShelfLife) {
		this.foodShelfLife = foodShelfLife;
	}
	
	public boolean isRawFood() {
		return rawFood;
	}
	
	public void setRawFood(boolean rawFood) {
		this.rawFood = rawFood;
	}
	
	public boolean isFoodGlutenFree() {
		return foodGlutenFree;
	}
	
	public void setFoodGlutenFree(boolean foodGlutenFree) {
		this.foodGlutenFree = foodGlutenFree;
	}
	
	public void fryFoodOnOil() {
		setFoodFats(getFoodFats() + 1);
	}

	public void fryFoodOnFire() {
		setFoodFats(getFoodFats() - 1);
	}
	
	public void startFreezingFood() {
		setFoodShelfLife(getFoodShelfLife() + 10);
	}
	
	private void stopFreezingFood() {
		setFoodShelfLife(getFoodShelfLife() - 10);
	}
	
	private void boilInWater() {
		setFoodProteins(getFoodProteins() - 5);
			}
	
	private void eatRawFood() {
		setRawFood(true);
	}
}