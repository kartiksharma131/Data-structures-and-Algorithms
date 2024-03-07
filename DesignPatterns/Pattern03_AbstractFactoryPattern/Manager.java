package Pattern03_AbstractFactoryPattern;

public class Manager implements Employee{

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Manager";
	}

}
