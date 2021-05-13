package dump;

public class DumpCLass {

	static
	{
		System.out.println("inside static block");
	}
	
	{
		System.out.println(" inside init block");
	}
	
	DumpCLass() {
	
		System.out.println("inside dump class constructor");
	}
	public static void main(String[] args) {
		System.out.println("inside main");
		DumpCLass obj = new DumpCLass();
	}
}
