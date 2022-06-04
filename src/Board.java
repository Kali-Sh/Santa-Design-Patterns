import java.util.ArrayList;
import java.util.List;

public class Board implements IAmObservable{
	
	public void makeMeDoll() {
		System.out.println("I want a doll.");
	}
	
	public void makeMeBike() {
		System.out.println("I want a bike.");
	}

	private List<IObserve> observers;
	String toy;
	
	public Board() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(IObserve observer) {
		this.observers.add(observer);
		observer.setBoard(this);
	}

	@Override
	public void unsubscribe(IObserve observer) {
		this.observers.remove(observer);
		observer.setBoard(null);
	}

	@Override
	public void notifyObservers() {
		for(IObserve observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.toy;
	}

	public void setToy(String toys) {
		this.toy = toys;
		this.notifyObservers();
	}
}
