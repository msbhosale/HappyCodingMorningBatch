package in.happycoding.model;

public class Car {
	
	private String name;
	private Engine engine;
	
	public Car() {
		
	}
	
	public Car(String name, Engine engine) {
		
		this.name = name;
		this.engine = engine;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		
		System.out.println("Adding engine to the car");
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}
	
	public void run() {
		
		if(this.getEngine() != null) {			
			System.out.println("Car is running");
		} else {
			System.out.println("No engine found");
		}
	}

}
