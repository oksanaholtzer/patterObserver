package designPatternObserver;

import java.util.ArrayList;
import java.util.List;

import designPattern.Vehicule;

public class Parking extends Subject {
	public String code;
	public static int occupation=0;
	public  int capacity=0;
	
	public List <Vehicule> vehicules;
	
	

	public Parking(String code,int capacity) {
		super();
		this.code = code;
		this.capacity= capacity;
		
	}

	public void park (Vehicule veh) {
		if (vehicules==null) {
			vehicules= new ArrayList<Vehicule> ();
		}
		vehicules.add(veh);
		occupation ++;
	}
	
	public void sort (Vehicule veh) {
		if (vehicules!=null && vehicules.size()>=1) {
			vehicules.remove(veh);
			occupation--;
		}
		
		
	}
	
	


	@Override
	public void notifyObs() {
		if(occupation>capacity) {
			System.out.println ("parking full");
		}
		
	}

}
