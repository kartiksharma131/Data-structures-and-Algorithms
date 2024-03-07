package singleton;

public class JalebiUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jalebi jalebi1 = Jalebi.getJalebi();
		System.out.println(jalebi1.hashCode());
		
		Jalebi jalebi2 = Jalebi.getJalebi();
		System.out.println(jalebi2.hashCode());

	}

}
