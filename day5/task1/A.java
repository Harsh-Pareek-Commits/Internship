package day5.task1;

public class A {

	int x =10;
	A(){
		super();
		System.out.println("A");
	}
	
}

class B extends A
{
	
	B(int x)
	{
		super();
		System.out.println("B");
	}
}

class C extends B
{
	C()
	{
		super(45);
		System.out.println("C");
	}
	
}
