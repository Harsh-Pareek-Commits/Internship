package P1;
import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	int jv,eng,sts,db,sum=0,avg=0;
	System.out.println("Please enter java marks:");
	Scanner sc = new Scanner(System.in);
	jv=sc.nextInt();
	System.out.println("Please enter English marks:");
	Scanner sc2 = new Scanner(System.in);
	eng=sc2.nextInt();
	System.out.println("Please enter STS marks:");
	Scanner sc3 = new Scanner(System.in);
	sts=sc.nextInt();
	System.out.println("Please enter DB marks:");
	Scanner sc4 = new Scanner(System.in);
	db=sc.nextInt();
	sum=jv+eng+sts+db;
	avg=sum/4;
	System.out.println("  SUBJECTS             MARKS");
	System.out.println("--------------------------------");
	System.out.println("  JAVA                 "+jv);
	System.out.println("  ENGLISH              "+eng);
	System.out.println("  STS                  "+sts);
	System.out.println("  DB                   "+db);
	System.out.println("--------------------------------");
	System.out.println("  Total Marks          "+sum);
	System.out.println("  Average Marks        "+avg);
}
}
