package P1;

import java.util.Scanner;

public class Q2_Salary {
	public static void main(String[] args) {
		double bsal,tax,hra,da,total_Salary,inhand_Salary;
		System.out.println("Please enter your basic salary:  ");
		Scanner sc =new Scanner(System.in);
		bsal= sc.nextDouble();
		hra = 0.40*bsal;
		 da = 0.60*(bsal+hra);
		 total_Salary= bsal+hra+da;
		   if (bsal<=200000)
				tax = 0;
			else if (bsal>200000 && bsal<=600000)
				tax = 0.10*total_Salary;
			else
				tax = 0.20*total_Salary;
		   inhand_Salary= total_Salary-tax;
		   System.out.println("               SALARY SLIP                ");
		    System.out.println("------------------------------------------");
		    System.out.println("   Basic Salary:           "+bsal);
			System.out.println("   HRA:                    "+hra);
			System.out.println("   DA:                     "+da);
			System.out.println("   Total Salary:           "+total_Salary);
			System.out.println("   Tax:                    "+tax);
			System.out.println("------------------------------------------");
		    System.out.println("   Inhand Salary:          "+inhand_Salary);   
		   
		   
	}

}
