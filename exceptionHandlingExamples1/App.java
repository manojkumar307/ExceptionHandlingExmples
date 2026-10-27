package exceptionHandlingExamples;

public class App {

	void digitalBanking() {
		System.out.println("Connection established with Bank.");
		
		try {
			Bank b = new Bank();
			b.initiateBanking();
		} catch (Exception e) {
			System.out.println("You have an alert message from bank.");
		}
		System.out.println("Connection terminated with bank.");
	}
}
