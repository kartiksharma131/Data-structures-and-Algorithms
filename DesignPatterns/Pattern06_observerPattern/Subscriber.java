package Pattern06_observerPattern;

public class Subscriber implements Observer{

	@Override
	public void notified() {
		// TODO Auto-generated method stub
		System.out.println("Video uploaded");
		
	}

}
