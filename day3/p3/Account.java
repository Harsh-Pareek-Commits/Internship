package day3.p3;

public class Account {

	private int accountNumber;
	private String accountHolderName;
	private int balance;
	private int noOfPolicies = 0;

	private Policy policies[]; // collections

	Account(int num, String name) {
		this.accountNumber = num;
		this.accountHolderName = name;
		policies = new Policy[10];
	}
	Account() {
		super();	}
	// INITIALIZING POLICIES ARRAY
	public void addPolicy(Policy policy) {
		if (noOfPolicies == 9) {
			System.out.println("Cannot add more policies");
			return;
		}

		policies[noOfPolicies] = policy;
		noOfPolicies++;
	}

	// DISPLAYING INFORMATION
	public void acc_Details() {
		System.out.println("=======ACCOUNT DETAILS=======");
		System.out.println("ACCOUNT NUMBER: " + getAccountNumber());
		System.out.println("HOLDER NAME: " + getAccountHolderName());
		System.out.println("ACCOUNT BALANCE: " + getBalance());
		System.out.println("Number of Policies: " + getNoOfPolicies());
		System.out.println("Policies:");
		if (noOfPolicies == 0) {
			System.out.println("\tYou have not opted for any policy");
			return;
		}
		for (Policy p : policies) {
			if (p != null) {
				System.out.println("\t" + p.getPolicyName());

			}
		}

	}
	// DISPLAYING POLICY BY ID
	
	public void getPolicyById(int id) {
		for (Policy p : policies) {
			if (p != null) {
				if (p.getPolicyId() == id) {
					System.out.println("Policy details with ID");
					p.policy_Details();
				} else {
					System.out.println("You dont have any policy with that id");
				}
			}
		}
	}

	
	// GETTER AND SETTERS
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public int getNoOfPolicies() {
		return noOfPolicies;
	}

	public void setNoOfPolicies(int noOfPolicies) {
		this.noOfPolicies = noOfPolicies;
	}

	public void setPolicies(Policy[] policies) {
		this.policies = policies;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Policy[] getPolicies() {
		return policies;
	}

}
