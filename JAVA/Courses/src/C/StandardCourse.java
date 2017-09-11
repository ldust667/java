package C;

public class StandardCourse extends Course {

	
	public StandardCourse(){}
	public StandardCourse(String courseName, String department, String lastName, int credits) {
		super(courseName, department, lastName, credits);
		// TODO Auto-generated constructor stub
	}

	public void display(String courseName,String department,String lastName,int credits){
		System.out.println("Course name and department: "+courseName+" "+department+" Professor's last name and credits "+lastName+" "+credits+"Your total fee is: $"+getFee() );
		
	}
	public StandardCourse(String courseName, String department){
		super(courseName,department);
	}
	
}
