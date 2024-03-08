package Pattern07_IteratorPattern;

public class User {

	private String name;
	private int userID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public User(String name, int userID) {
		super();
		this.name = name;
		this.userID = userID;
	}
	 
}
