package Pattern07_IteratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManagement userMgmt = new UserManagement();
		
		userMgmt.addUser(new User("kartik",1));
		userMgmt.addUser(new User("kartik",2));
		userMgmt.addUser(new User("kartik",3));
		userMgmt.addUser(new User("kartik",4));
		
		MyIterator itr =userMgmt.getIterator();
		
		
	}

}
