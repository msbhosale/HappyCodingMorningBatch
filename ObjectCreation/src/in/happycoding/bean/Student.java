package in.happycoding.bean;

public class Student {
	
	private int rollNumber;
	private String name;
	
	public Student() {
		
		System.out.println("Creating Obj using default constructor");
	}
	
	

	public Student(int rollNumber, String name) {
		

		System.out.println("Creating Obj using parameterised constructor");
		
		this.rollNumber = rollNumber;
		this.name = name;
	}



	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
	

}
