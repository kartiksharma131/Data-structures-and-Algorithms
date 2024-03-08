package Pattern08_AdapterPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program started");
		ChargerDK androidCharger = new ChargerDK();
		AppleCharger charger = new AdapterCharger(androidCharger);
		iphone14 iphone = new iphone14(charger);
		
		iphone.chargePhone();
	}

}
