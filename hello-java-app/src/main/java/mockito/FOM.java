package mockito;

import java.util.List;

public class FOM {
	
	private F1CarService carService;
	private List<F1Car> cars;
	
	public F1CarService getCarService() {
		return carService;
	}
	public void setCarService(F1CarService carService) {
		this.carService = carService;
	}
	public List<F1Car> getCars() {
		return cars;
	}
	public void setCars(List<F1Car> cars) {
		this.cars = cars;
	}
	
	public int getCarValue() {
		
		int value=0;
		
		for(F1Car car:cars) {
			value+=car.getRpm();
		}
		
		return value;
		
	}

}
