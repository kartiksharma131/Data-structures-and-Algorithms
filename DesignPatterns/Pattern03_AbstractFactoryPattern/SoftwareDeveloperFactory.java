package Pattern03_AbstractFactoryPattern;

public class SoftwareDeveloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new SoftwareDeveloper();
	}
	
}
