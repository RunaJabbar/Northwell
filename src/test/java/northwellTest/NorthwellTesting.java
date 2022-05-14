package northwellTest;


import basePack.Basics;

public class NorthwellTesting extends Basics {
	@org.testng.annotations.Test
	
	public void northwellTesting() {
		payBill.payBill(commonActions);
		payBill.continueAsGuest(commonActions);
		payBill.lastName(commonActions, "Jabbar");
		payBill.accountNumber(commonActions, "205455");
		payBill.dob(commonActions, "12/30/1991");
		payBill.findMyAccount(commonActions);
	}
}