package task1;

public class MainClass {
	public static void main(String[] args) {
		int x=0;
		Engine e1 = new Engine(800);
		Engine e2 = new Engine(1800);
		Car arr[] = new Car[3];
		Car obj1 = new Car(e1);
		obj1.setCarName("Honda");
		obj1.setCarPower(1000);
		Car obj2 = new Car(e2);
		obj2.setCarName("Maruti");
		Car obj3 = new Car(e1);
		obj3.setCarName("BMW");
		MainClass mc=new MainClass();
		mc.insertCar(arr,obj1,x++);
		mc.insertCar(arr,obj2,x++);
		mc.insertCar(arr,obj3,x++);
		mc.insertCar(arr,obj3,x++);
		// insert into an array
		
		// ---- iterate the array
		// approach - 1
		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i].getCarName()+" - "+arr[i].getCarPower());
		}
		System.out.println("-----------------------------------");
		// --- appraoch 2
		for (Car car : arr) {
		System.out.println(car.getCarName()+" --- "+car.getCarPower());
		}
		System.out.println("-----------------------------------");
		for (Car car : arr) {
		 if(car.getCarPower()>1500) {
			 
				System.out.println(car.getCarName());
			 }
			}
		
	}
	public void insertCar(Car c[],Car obj,int x) {
		 
		if(x>2) {
			System.out.println("No space to park you car");
		}
		else {
		c[x]=obj;
		
		}
	}
}
