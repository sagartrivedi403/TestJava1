package OOP1;

public class AccountHolder {
	String fname;
	String lname;
	int mobile;
	int age;
	float accountbalance;
	boolean eligibleForCreditCard;
	
	public void testEligibilityForCreditCard() {
		
		if(age>25 && accountbalance>=20000) {
			eligibleForCreditCard=true;
		}
		
	}

}
