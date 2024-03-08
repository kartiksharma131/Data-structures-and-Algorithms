package Pattern05_PrototypePattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Created object using prototype");

		NetworkConnection connection =new NetworkConnection();
		connection.setIp("192.68.4.4");
		connection.loadImpData();
		
		System.out.println(connection.toString());
		
		//we want new object of network connection
		NetworkConnection connection2=null;
		try {
			connection2= (NetworkConnection)connection.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
