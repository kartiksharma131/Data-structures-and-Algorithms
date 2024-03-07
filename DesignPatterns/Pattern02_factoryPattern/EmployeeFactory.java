package Pattern02_factoryPattern;

public class EmployeeFactory {

	//get the employee
	public static Employee getEmployee(String EmployeeType) {
		if(EmployeeType.trim().equalsIgnoreCase("SOFTWARE DEVELOPER")) {
			return new SoftwareDeveloper();
		}
		else {
			return new QualityAnalyst();
		}
	}
}
