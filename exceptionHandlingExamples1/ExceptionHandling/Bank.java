package ExceptionHandling;

public class Bank {
	void Initiate() {
		Atm atm = new Atm();
		try {
			atm.takeInput();
			atm.validate();			
		} catch (Exception e1) {
			System.out.println("You are left with too more attempts.");
			try {
				atm.takeInput();
				atm.validate();
			} catch (Exception e2) {
				System.out.println("You are left with one last attempt");
				try {
					atm.takeInput();
					atm.validate();
				} catch (Exception e3) {
					System.out.println("You have entered you PIN wrong 3 timmes. So your card is blocked. Contact Bank.");
				}
			}
		}
	}
}
