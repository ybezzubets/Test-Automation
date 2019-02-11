package lesson1;

public class AlcoholDrinks

{
	private float bottleVolume; //об'єм бутилки.
	private float ABV; //вміст спирту в напої.
	private boolean alcoholCocktail; //поєднання із іншими напоями, тип даних - булева змінна, приймаюча значення true чи false.
	
	public float getBottleVolume() {
		return bottleVolume;
	}
	
	public void setBottleVolume(float bottleVolume) {
		this.bottleVolume = bottleVolume;
	}
	
	public float getABV() {
		return ABV;
	}
	
	public void setABV(float ABV) {
		this.ABV = ABV;
	}
	
	public boolean isAlcoholCocktail() {
		return alcoholCocktail;
	}
	
	public void setAlcoholCocktail(boolean alcoholCocktail) {
		this.alcoholCocktail = alcoholCocktail;
	}
   
	public void startShakeCocktail() {
		setAlcoholCocktail(true);
    }

	public void stopShakeCocktail() {
		setAlcoholCocktail(false);
    }

	
	private void addMoreABV() {
		setABV(getABV() + 5);
    }
	
	private void pourAHalfLiter() {
		setBottleVolume(getBottleVolume() + 5);
    }

	private void pourALiter() {
		setBottleVolume(getBottleVolume() + 1);
    }
}