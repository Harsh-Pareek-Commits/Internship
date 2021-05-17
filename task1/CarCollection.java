package task1;

public class CarCollection {
Car cars[]=new Car[5];
int totalCar=0;
public void insertingCar(Car c) {
	if(totalCar>=5) {
		System.out.println("You dont have more space to park new car");
	}else {
		cars[totalCar]=c;
		totalCar++;
	}
}
public CarCollection() {
	super();
}
public Car[] getCars() {
	return cars;
}
public void setCars(Car[] cars) {
	this.cars = cars;
}
public int getTotalCar() {
	return totalCar;
}
public void setTotalCar(int totalCar) {
	this.totalCar = totalCar;
}
}
