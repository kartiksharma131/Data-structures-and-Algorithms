package section13_oops;

public class car extends vehicle{
	private int numGears;
	private int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}

	public boolean isConvertible() {
		return isConvertible;
	}

	public void setConvertible(boolean isConvertible) {
		this.isConvertible = isConvertible;
	}

	boolean isConvertible;
	
	public void print() {
		super.print();
		System.out.println("car color: "+ color);
		System.out.println("car color: "+ maxSpeed);
		System.out.println("car color: "+ numGears);
		System.out.println("car color: "+ isConvertible);
		
	}
}
