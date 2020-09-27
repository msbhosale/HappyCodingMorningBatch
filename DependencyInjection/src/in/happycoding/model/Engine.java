package in.happycoding.model;

public class Engine {

	private String make;
	
	public Engine() {
		
	}

	public Engine(String make) {
		
		this.make = make;
	}
	
	

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Engine [make=" + make + "]";
	}
	
}