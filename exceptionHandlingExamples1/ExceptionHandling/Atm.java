package ExceptionHandling;

import java.util.Scanner;

public class Atm {
	int accNo = 1111;
	int pin = 1234;
	int userPin;
	
	void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.:- ");
		userPin = sc.nextInt();
	}
	
	void validate() throws Exception {
		if (userPin == pin) {
			System.out.println("Wellsome to the ATM and strt your transaction");
		} else {
			System.out.println("Invalid PIN");
			InvalidPinException ipe = new InvalidPinException();
			System.out.println(ipe.getMessage());
			throw ipe; 
		}
	}
}
