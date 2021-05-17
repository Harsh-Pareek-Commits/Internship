package task1;
enum Components {
	wifi, usbPort, dvdDrive, audioJack, screen
};
public class MainRunner {

	public static void main(String[] args) {
		
		Engine hondaEngine = new Engine(1000); // type of A
		Engine tataEngine = new Engine(1200);  // type B
		String support[]=new String[3];
		support[0]=Components.wifi.toString();
		support[1]=Components.usbPort.toString();
		support[2]=Components.dvdDrive.toString();
		CarCollection cc=new CarCollection();
		MusicSystem player=new MusicSystem(support);
		
		// --- default features-----
		//  ---- Base model ---
		Car car1 = new Car(hondaEngine);
	   cc.insertingCar(car1);
		car1.moveCarForward();
		
		// ---- new enhancements in old component ---
		// ---- do some changes in base engine --
		Engine e = car1.getEngine();
		e.setBasepower(e.getBasepower()+1);
		
		car1.moveCarForward();
		
		//--- Switch to new component ---
		// --- change engine ---
		
		car1.setEngine(tataEngine);
		car1.moveCarForward();
		car1.setMs(player);
		car1.getMs().changeMode("wifi");
		car1.getMs().pressPowerButton();
		car1.getMs().changeMode("audioJack");
		car1.getMs().changeMode("wifi");
		car1.getMs().next();
		car1.getMs().next();
		car1.getMs().previous();
		
	}
}
