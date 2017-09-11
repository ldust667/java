
public class Car extends Vehicle implements OperateCar {

	private boolean motorcycle;
	public Car(String Motorcycle) {
		super(Motorcycle);
		if(Motorcycle.equals(true))
		{
	motorcycle=true;
	
	
	
		}
else motorcycle=false;

	}
	public boolean isMotorcycle() {
		return motorcycle;
	}
	public void setMotorcycle(boolean motorcycle) {
		this.motorcycle = motorcycle;
	}
	@Override
	public void turn(String direction) {
		// TODO Auto-generated method stub
		System.out.print("Car turning.. "+direction+".");
	}
	@Override
	public void changeLanes(String direction) {
		// TODO Auto-generated method stub
		System.out.println("Changing to... "+direction+" Lane.");
	}
	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Going..");
	}
	@Override
	public void radarFront(Car c) {
		// TODO Auto-generated method stub
		System.out.println("Scanning front of Car "+ c);
	}
	@Override
	public void radarBack(Car c) {
		// TODO Auto-generated method stub
		System.out.println("Scanning back of Car "+ c);
	}

}
