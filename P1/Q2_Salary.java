package P1;

import java.util.Scanner;

public class Q2_Salary {
	public static void main(String[] args) {
		double bsal,tax,hra,da,total_Salary,inhand_Salary;
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Please enter your basic salary of "+(i+1) +" person :  "); 
			sal_cal(sc.nextLine());
		}
		
		   
	}
	public static void sal_cal(String sal)
	
	{
		double tax,hra,da,total_Salary,inhand_Salary;
          float bsal= Float.parseFloat(sal);
		hra = 0.40*bsal;
		 da = 0.60*(bsal+hra);
		 total_Salary= (bsal+hra+da)*12;
		   if (bsal<=200000)
				tax = 0;
			else if (bsal>200000 && bsal<=600000)
				tax = 0.10*total_Salary;
			else
				tax = 0.20*total_Salary;
		   inhand_Salary= total_Salary-tax;
		   System.out.println("\t\tSALARY SLIP\t\t");
		    System.out.println("------------------------------------------");
		    System.out.println("\t Basic Salary:\t"+bsal);
			System.out.println("\t HRA:\t\t"+hra);
			System.out.println("\t DA:\t\t"+da);
			System.out.println("\t Total Salary:\t"+total_Salary);
			System.out.println("\t Tax:\t\t"+tax);
			System.out.println("------------------------------------------");
		    System.out.println("\t Inhand Salary:\t"+inhand_Salary);   
		   
	}

}
