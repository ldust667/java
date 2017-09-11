
public class Vehicle {

	private Boolean bike;
	
	
	public Vehicle(String Motorcycle){
	if(Motorcycle.equals("bike"))
			{
		bike=true;
		
		
		
			}
	else bike=false;}
	public Boolean getBike() {
		return bike;
	}
	public void setBike(Boolean bike) {
		this.bike = bike;
	}
}
