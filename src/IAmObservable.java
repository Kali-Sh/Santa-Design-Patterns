import java.util.List;

public interface IAmObservable {
	
	void subscribe(IObserve observer);
	void unsubscribe(IObserve observer);
	
	void notifyObservers();
	String getUpdate();
}
