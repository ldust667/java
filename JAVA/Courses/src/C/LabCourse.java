package C;

public class  LabCourse extends Course {
final int LAB_FEE=300;

public LabCourse(String courseName, String department, String lastName, int credits) {
		super(courseName, department, lastName, credits);
		
		
		// TODO Auto-generated constructor stub
		setFee(LAB_FEE*credits);
	}

public void display(String courseName,String department,String lastName,int credits){

	System.out.println("Course name and department: "+courseName+" "+department+" Professor's last name and credits "+lastName+" "+credits+"Your total fee is: "+getFee() );
}
public LabCourse(String courseName, String department){
	setCourseName(courseName);
	setDepartment(department);
	setFee(LAB_FEE*this.getCredits());
}

public LabCourse() {
	// TODO Auto-generated constructor stub
}




}
