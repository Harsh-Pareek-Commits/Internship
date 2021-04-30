package regularexp;

import java.util.*;
public class task2 {
	static String buffer[] = {"DEL","BGL","HYD","GOI","AHD","MUM","PUN","CHN","KOL","LUK","CHG"};
public static void main(String[] args) {
	
	Set<String> Code = new HashSet<String>();
	task2 obj=new task2();
	for(int i=0;i<10;i++) {
		obj.genCode(Code);
	}
	for(String s:Code) {
		System.out.println("Code: "+s);
	}
	
}
private void genCode(Set<String> c) {
	Random rand = new Random();
	int index=rand.nextInt(11);
	int mm=rand.nextInt(11) + 1;
	int year=((rand.nextInt(100))+1947);
	String Code="";
	if(mm<10) {
		 Code =buffer[index]+"-0"+mm+"-"+year;
	}else
	{
		 Code =buffer[index]+"-"+mm+"-"+year;
	}
	boolean added = c.add(Code);
	if (!added) {
		genCode(c);
	}

}
}
