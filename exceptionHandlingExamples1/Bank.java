package exceptionHandlingExamples;

public class Bank {

	void initiateBanking() throws Exception {
		System.out.println("Connection established with bank server.");
		try {
			Atm atm = new Atm();
			atm.withdraw();
		} catch (Exception e) {
			System.out.println("Issue has reached the bank, the will check that.");
			throw e;
		}
		finally {
			System.out.println("Connection terminated with bank sertver");
		}
	}
}
