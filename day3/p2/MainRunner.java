package day3.p2;

public class MainRunner {

	public static void main(String[] args) {
		
		Engine e1 = new Engine(2000);
		
		Car honda = new Car(e1);
		
		System.out.println(honda.getE().getPower()+" speed "+honda.getTopSpeed());
		honda.setTopSpeed(100);
		System.out.println(honda.getE().getPower()+" speed "+honda.getTopSpeed());

		Car mycarWitjTopSpeed = new Car(e1, 200);
		System.out.println(mycarWitjTopSpeed.getE().getPower()+" speed "+mycarWitjTopSpeed.getTopSpeed());
		Engine e2 = new Engine(2400);
		honda.setE(e2);
		
		System.out.println(honda.getE().getPower());
		
		Car khaliCar = new Car();
		System.out.println(khaliCar.getE()+" speed "+khaliCar.getTopSpeed());
		khaliCar.setE(new Engine(500));
		System.out.println(khaliCar.getE()+" speed "+khaliCar.getTopSpeed());
khaliCar.setTopSpeed(1000);
		
		System.out.println(khaliCar.getE().getPower()+" speed "+khaliCar.getTopSpeed());
		
		
	}
}
