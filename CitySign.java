package designPatternObserver;

public class CitySign extends Observer{
	Parking parking;
	
	

	public CitySign(Parking parking) {
		super();
		this.parking = parking;
	}



	@Override
	public void update(String message) {
		parking.notifyObs();
		
	}

}
