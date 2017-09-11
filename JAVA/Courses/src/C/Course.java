package C;

public abstract class  Course {
	private String courseName;
	private String department;
	private int fee;
	private String lastName;
	private int credits;
	public static final int FEE_PER_CREDIT=500;
	private static final int LAB_FEE = 300;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public Course(String courseName,String department,String lastName,int credits){
		this.courseName=courseName;
		this.department=department;
		this.lastName=lastName;
		this.credits=credits;
		this.fee=FEE_PER_CREDIT*credits;
		

	
	
	}
	public abstract void display(String courseName,String department,String lastName,int credits);
	public Course(){}
	public Course(String courseName,String department){
		this.courseName=courseName;
		this.department=department;
		this.fee=FEE_PER_CREDIT*getCredits();
	}

	
}