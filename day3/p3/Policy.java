package day3.p3;

public class Policy {

	private int policyId;
	private String policyName;
	private int policyAmount;
	private int premium;
	private int term;

	Policy(int pid, String pname, int pamt, int pp, int pterm) {
		this.policyAmount = pamt;
		this.policyId = pid;
		this.policyName = pname;
		this.premium = pp;
		this.term = pterm;
	}

	// POLICY DETAILS
	public void policy_Details() {
		System.out.println("\n\n=======Policy DETAILS=======");
		System.out.println("Policy Id: " + getPolicyId());
		System.out.println("Policy Name: " + getPolicyName());
		System.out.println("Policy Amount: " + getPolicyAmount());
		System.out.println("Policy Premium: " + getPremium());
		System.out.println("Policy Term:" + getTerm());

	}

	// GETTER AND SETTERS
	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public int getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

}
