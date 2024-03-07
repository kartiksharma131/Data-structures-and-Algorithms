package Pattern01_singleton;


public class Samosa {
	private static Samosa samosa;
	
	private Samosa() {
		if(samosa!=null) {
			throw new RuntimeException("You're trying to break singleton pattern");
		}
	}
	//lazy way
	// not thread safe
	/*public static Samosa getSamosa() {
		if(samosa==null) {
			samosa = new Samosa();
		}
		return samosa;
	}*/
	
	//thread safe method
	// use synchronized block
	public static Samosa getSamosa() {
		
		
		if(samosa==null) {
			
			synchronized (Samosa.class) {
				if(samosa==null) {
					samosa = new Samosa();
				}
			}
			
		}
		return samosa;
	}
}
