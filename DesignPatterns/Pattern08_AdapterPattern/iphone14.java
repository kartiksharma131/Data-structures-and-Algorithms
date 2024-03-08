package Pattern08_AdapterPattern;

public class iphone14 {

	private AppleCharger appleCharger;
	
	public iphone14(AppleCharger appleCharger) {
		this.appleCharger=appleCharger;
	}
	public void chargePhone() {
		appleCharger.chargePhone();
	}
}
