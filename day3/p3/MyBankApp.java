package day3.p3;

public class MyBankApp {

	public static void main(String[] args) {
		// Create Accounts

		Account harshAcc = new Account(0, "Harsh");
		
		Policy jevanBima = new Policy(1, "Jevan Bima Yojna", 100000, 2500, 20);
		harshAcc.addPolicy(jevanBima);
		// Display Information
		harshAcc.acc_Details();
		// Display Information related to Policies
		jevanBima.policy_Details();
		// Get the policy by Id for specific account
		System.out.println("SEARCHING BY ID");
		harshAcc.getPolicyById(1);

	}

}
