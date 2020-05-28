package designPatternObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
private List<Observer> observers = new ArrayList<Observer>();

	public abstract void notifyObs();
	
	public void attacheObserver(Observer obs) {
		if (observers==null) {
			observers = new ArrayList<Observer>();
		}
		observers.add(obs);
		
	}

}
