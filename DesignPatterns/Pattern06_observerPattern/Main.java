package Pattern06_observerPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YoutubeChannel channel = new YoutubeChannel();
		
		Subscriber aman = new Subscriber();
		
		channel.subscribe(aman);
		
		channel.notifyChanges();
		
		
	}

}
