package Pattern01_singleton;

public class Jalebi {
	
	//Eager way of creating singleton object
	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}
}
