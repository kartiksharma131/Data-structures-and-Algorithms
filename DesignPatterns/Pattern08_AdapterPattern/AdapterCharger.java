package Pattern08_AdapterPattern;

public class AdapterCharger implements AppleCharger{

	private AndroidCharger charger;
	
	public AdapterCharger(AndroidCharger charger) {
		this.charger=charger;
	}
	@Override
	public void chargePhone() {
		// TODO Auto-generated method stub
		charger.chargeAndroidPhone();
		System.out.println("phone is charging using adapter and android charger");
	}

}
