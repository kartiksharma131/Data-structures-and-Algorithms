package Pattern03_AbstractFactoryPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = EmployeeFactory.getEmployee(new SoftwareDeveloperFactory());
		Employee e2 = EmployeeFactory.getEmployee(new QualityAnalystfactory());
		
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		
		Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
		System.out.println(e3.getName());

	}

}
