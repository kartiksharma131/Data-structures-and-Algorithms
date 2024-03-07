package factoryPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = EmployeeFactory.getEmployee("Software Developer");
		System.out.println(e1.getSalary());
	}

}
