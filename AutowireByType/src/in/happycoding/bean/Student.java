package in.happycoding.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int rollNumber;
	private String name;
	private Date birthDate;
	private Address address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNumber, String name, Date birthDate, Address address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
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




	public Date getBirthDate() {
		return birthDate;
	}




	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", birthDate=" + birthDate + ", address="
				+ address + "]";
	}



	
	
	
	
	
}
