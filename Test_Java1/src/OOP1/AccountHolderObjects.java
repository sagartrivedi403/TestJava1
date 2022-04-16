package OOP1;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		AccountHolder Sagar = new AccountHolder();
		AccountHolder Neha = new AccountHolder();
		AccountHolder Henry = new AccountHolder();
		
		Sagar.fname="Sagar";
		Sagar.lname="Trivedi";
		Sagar.mobile=07435633355;
		Sagar.age=30;
		Sagar.accountbalance=20000;
		Sagar.testEligibilityForCreditCard();
		System.out.println("Is Sagar eligible for Credit Card? "+Sagar.eligibleForCreditCard);
		
		Neha.fname="Neha";
		Neha.lname="Trivedi";
		Neha.mobile=07435633355;
		Neha.age=24;
		Neha.accountbalance=25000;
		Neha.testEligibilityForCreditCard();
		System.out.println("Is Neha eligible for Credit Card? "+Neha.eligibleForCreditCard);
		
		Henry.fname="Henry";
		Henry.lname="Trivedi";
		Henry.mobile=07435633366;
		Henry.age=35;
		Henry.accountbalance=20001;
		Henry.testEligibilityForCreditCard();
		System.out.println("Is Henry eligible for Credit Card? "+Henry.eligibleForCreditCard);
		
	}
}
