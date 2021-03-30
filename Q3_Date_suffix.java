package P1;
import java.util.Scanner; 
public class Q3_Date_suffix {
public static void main(String[] args) {
	int dt,digit=0;
	System.out.println("Please enter the date:");
	Scanner sc=new Scanner(System.in);
	dt=sc.nextInt();
	if (dt>31|| dt<1)
	{
		System.out.println("Please enter a valid date");
	}
	else
	{
		digit=dt;
		if (dt>21) {
		      digit %= 10;
		  	
		    }
		else if(dt>10 && dt<22)
		{
			digit=0;
		}
		else  if(dt<4)
		{
			digit=dt;
		}
		System.out.println("Your date with suffix is:");
		switch(digit)
		{
		case 1:
			System.out.println(dt+"st");
			break;
		case 2:
			System.out.println(dt+"nd");
			return;
		case 3:
			System.out.println(dt+"rd");
			break;
		default:
			System.out.println(dt+"th");
			
		}
		}
	
}
}
