package P1;

public class BankCust {
	private int acc_number;
	private String Holder_name;
	private Boolean loan_approved;
	private double loan_amount;
	private double amount;

	void getUser(int acc_num, String name) {
		acc_number = acc_num;
		Holder_name = name;
		
	}

	void addmoney(int amt) {
		System.out.println("Balance added");
		amount = amount + amt;
		getBalance();
	}

	void withdrawal(int amt) {
		if (amt > amount) {
			System.out.println("You dont have sufficent balance");
		} else {
			System.out.println("Collect your cash:" + amt);
			amount = amount - amt;
		}
	}

	void getBalance() {
		System.out.println("Your current balance is:" + amount);
	}
	void displayUser() {
		System.out.println("\nACCOUNT HOLDER  DETAILS");
		System.out.println("Account number:" + acc_number);
		System.out.println("Holder name:" + Holder_name);
		System.out.println("Balance:" + amount);
	}

	public static void main(String[] args) {
		BankCust user1 = new BankCust();
		user1.getUser(1, "Harsh");
		user1.addmoney(1000);
		user1.withdrawal(800);
		user1.withdrawal(500);
		user1.getBalance();
		user1.displayUser();
	}

}
