package Pattern05_PrototypePattern;

public class NetworkConnection implements Cloneable{
	private String ip;
	private String impData;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImpData() {
		return impData;
	}
	public void setImpData(String impData) {
		this.impData = impData;
	}
	
	public void loadImpData() {
		this.impData = "very very imp data";
	}
	
	@Override
	public String toString() {
		return this.ip +" " + this.impData;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
