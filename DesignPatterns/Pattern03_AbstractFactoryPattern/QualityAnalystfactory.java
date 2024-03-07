package Pattern03_AbstractFactoryPattern;

public class QualityAnalystfactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new QualityAnalyst();
	}
	
}
