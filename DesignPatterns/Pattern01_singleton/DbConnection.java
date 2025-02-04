package Pattern01_singleton;

import java.util.ArrayList;
import java.util.List;

//Eager initialization
public class DbConnection {
	private static DbConnection dbConfig = new DbConnection();
	private DbConnection() {}
	public static DbConnection getConnection() {
		return dbConfig;
	}
	
}

//lazy initialization
/*public class DbConnection{
	private static DbConnection conObject;
	private DbConnection() {}
	public static DbConnection getConnection() {
		if(conObject==null) {
			conObject = new DbConnection();
		}
		return conObject;
	}
}

//Synchronized method
public class DbConnection{
	private static DbConnection conObject;
	private DbConnection() {}
	synchronized public static DbConnection getConnection() {
		if(conObject==null) {
			conObject = new DbConnection();
		}
		return conObject;
	}
}

//Double checked locking(majorly used)
public class DbConnection{
	private static volatile DbConnection conObject;
	private DbConnection() {}
	public static DbConnection getConnection() {
		synchronized (DbConnection.class) {
			if(conObject==null) {
				conObject = new DbConnection();
			}
		}
		return conObject;
	}
}*/