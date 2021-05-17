package day3.p2;

public class Car {

	private Engine e;
	private int topSpeed;
	
	public void startEngine()
	{
		e.doEngineThings();
	}
	
	
	
	Car(Engine ee)
	{
		e =ee;
	}

	public Car(Engine ee, int speed) {
		super();
		e = ee;
		topSpeed = speed;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	

}






















