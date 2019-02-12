package lesson2;

public class CargoPlane extends Airplane

{
	private int cargoPlaneSpeed;
	private int cargoPlaneWeight;
	
	public int getCargoPlaneSpeed() {
		return cargoPlaneSpeed;
	}
	
	public void setCargoPlaneSpeed(int cargoPlaneSpeed) {
		this.cargoPlaneSpeed = cargoPlaneSpeed;
	}

	public int getCargoPlaneWeight() {
		return cargoPlaneWeight;
	}

	public void setCargoPlaneWeight(int cargoPlaneWeight) {
		this.cargoPlaneWeight = cargoPlaneWeight;
	}

	public CargoPlane(int cargoPlaneSpeed, int cargoPlaneWeight) {
		this.setCargoPlaneSpeed(cargoPlaneSpeed);
		this.setCargoPlaneWeight(cargoPlaneWeight);	
	}
	
	public static void main(String[] args) {
		CargoPlane Boeing = new CargoPlane(19, 200);
		Boeing.addBaggage();
		CargoPlane Airbus = new CargoPlane(23, 180);
		Airbus.addBaggage();
		CargoPlane Antonov = new CargoPlane(12, 320);
		Antonov.addBaggage();
	}	
		
	public void addBaggage() {
		setCargoPlaneWeight(getCargoPlaneWeight() + 10);
    }
}
