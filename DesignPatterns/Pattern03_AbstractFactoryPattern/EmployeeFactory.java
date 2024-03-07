package Pattern03_AbstractFactoryPattern;

public class EmployeeFactory {
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}
}
