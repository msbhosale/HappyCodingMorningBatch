package in.happycoding.bean;

public class Address {

	private String city;
	private String pin;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String pin) {
		super();
		this.city = city;
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	
	
}