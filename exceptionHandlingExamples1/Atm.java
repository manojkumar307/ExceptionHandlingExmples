package exceptionHandlingExamples;

import java.util.Scanner;

public class Atm {

	int bal = 10000;

	void withdraw() throws Exception {
		System.out.println("Atm transaction star	ted.");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount to withdraw.");
			int amt = sc.nextInt();
			if (amt < bal) {
				System.out.println("Please collect cash");
			} else {
				System.out.println("Insufficient Balance");
			}
		} catch (Exception e) {
			System.out.println("Your transaction declined please contact Bank.");
			throw e;
		} finally {
			System.out.println("Atm transaction ended.");
		}
	}
}
