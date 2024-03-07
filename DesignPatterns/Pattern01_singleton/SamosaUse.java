package Pattern01_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SamosaUse {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Samosa s1 = Samosa.getSamosa();
		System.out.println(s1.hashCode());
		
		Samosa s2 = Samosa.getSamosa();
		System.out.println(s2.hashCode());
		
		// How to break Singleton pattern
		// Using reflection API
		
		Samosa s3 = Samosa.getSamosa();
		System.out.println(s1.hashCode());
		Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Samosa s4 = constructor.newInstance();
		System.out.println(s2.hashCode());
	}

}
