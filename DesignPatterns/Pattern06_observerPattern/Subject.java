package Pattern06_observerPattern;

public interface Subject {

	void subscribe(Observer ob);
	void unsubscribe(Observer ob);
	void notifyChanges();
	
}
