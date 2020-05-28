package designPatternObserver;

import designPattern.RegCar;
import designPattern.Vehicule;
import parking.Car;

public class ApplicationObsPattern {

	public static void main(String[] args) {
		Parking parking1= new Parking ("parking1",1);
		CitySign citySign1= new CitySign(parking1);
		parking1.attacheObserver(citySign1);
		parking1.park(new RegCar (1, "Peugeout"));
		parking1.park(new RegCar (1, "Peugeout"));
		parking1.park(new RegCar (1, "Peugeout"));
		parking1.notifyObs();

	}

}
