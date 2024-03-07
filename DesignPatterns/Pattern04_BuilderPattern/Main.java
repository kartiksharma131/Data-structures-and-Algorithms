package Pattern04_BuilderPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User.UserBuilder().setUserName("kartik").setUserId(1).setEmail("kartik185406@gmail.com").build();
		System.out.println(user.getEmail());
		System.out.println(user.getUserName());
		System.out.println(user.getUserId());
	}

}
