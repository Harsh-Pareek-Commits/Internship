package P1;
import java.util.Scanner; 
public class Q3_Date_suffix {
public static void main(String[] args) {
	int dt;
	System.out.println("Please enter the date:");
	Scanner sc=new Scanner(System.in);
	dt=sc.nextInt();
	if(dt>31 && dt<1) {
	System.out.println("Invalid date");	
	}else {
		switch(dt)
		{
		case 1:
		case 21:
		case 31:
			System.out.println(dt+"st");
			break;
		case 2:
		case 22:	
			System.out.println(dt+"nd");
			break;
		case 3:
		case 23:
				
			System.out.println(dt+"rd");
			break;
		
		default:
			System.out.println(dt+"th");
			
		}
		sc.close();
	
}
}
}