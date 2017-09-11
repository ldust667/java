import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car1=new Car("bike");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			while(input!="quit"){
				System.out.println("Which method would you like to call?");
				input=reader.readLine();
				if(input.equals("turn")){
					((Car) car1).turn("left");
					
				}
				else if(input.equals("Change lane")){
					((Car)car1).changeLanes("left");
				}
				else if(input.equals("go")){
					((Car)car1).go();
				}
				else if(input.equals("radar back")){
					((Car)car1).radarBack((Car) car1);
				
			}
				else if(input.equals("radar front")){
					((Car)car1).radarFront((Car) car1);}}}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}}


