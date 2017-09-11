package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Client {
static String input2=null;
static String input=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("What is the name of your class?");
		try{input=reader.readLine();}
		catch(Exception e){
			System.out.println("Compiler could not store input");
			}
		System.out.print("What department is it in?(ex.GE,IT)");
		try{input2=reader.readLine();}
		catch(Exception e){
			System.out.println("Compiler could not store input");
			}
		
		determineCourse(input,input2);
		
		
		
	}
	public static void determineCourse(String courseName,String department){
		
		if(input2.equals("IT")){
			Course myCourse= new LabCourse(courseName, department);
			StandardCourse myCourse1=new StandardCourse();
			//animal dog1=new Dog("jimmy");
		}
		else{
		Course myCourse1=new StandardCourse(courseName,department);
		Course myCourse=new LabCourse();
		}
	
		
		
		
	}
	
	
	
}
