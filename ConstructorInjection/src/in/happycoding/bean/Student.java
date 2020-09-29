package in.happycoding.bean;

public class Student {

	private int rollNumber;
	private String name;
	private Date birthDate;
	private Date admissionDate;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(int rollNumber, String name, Date birthDate, Date admissionDate) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.birthDate = birthDate;
		this.admissionDate = admissionDate;
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



	public Date getAdmissionDate() {
		return admissionDate;
	}



	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}



	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", birthDate=" + birthDate + ", admissionDate="
				+ admissionDate + "]";
	}

	
	
	
	
}
