package com.wipro_j2ee;
import java.util.Scanner;

public class Banking_Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 50000;
	    String name = "Pratyush";
		String accNum = "9876543210";
		
		double otherAcc = 4000;
		String otherAccNum = "0123456789";
		
		int options;
		System.out.println("Hello " + name);
		System.out.println("Your Account number is " + accNum);

		do {
			System.out.println("Operation options:");
			System.out.println("1.Check balance:");
			System.out.println("2. Deposit Amount:");
			System.out.println("3. Withdraw Amount:");
			System.out.println("4. Transfer Amount:");
			System.out.println("5. Exit");
			
			options = scanner.nextInt();
			switch(options) {
			case 1:
				System.out.println("Your current balance is " + balance);

				break;
			case 2:
				System.out.println("Deposit Amount :");
				double depAmount=scanner.nextDouble();
				if(depAmount>0) {
					balance += depAmount;
					System.out.println(depAmount + "has been deposited to your account ");
					System.out.println("Updated balance is " + balance);
				}else {
					System.out.println("Invalid deposit amount");
				}

				break;
			case 3:
				System.out.println("Withdraw Amount :");
				double withdrawAmount=scanner.nextDouble();
				if(withdrawAmount>0 && withdrawAmount<=balance) {
					balance -= withdrawAmount;
					System.out.println(withdrawAmount + "has been withdrawn from your account ");
					System.out.println("Updated balance is " + balance);
				}else {
					System.out.println("Invalid withdrawal amount");
				}

				break;
				
			case 4:
				System.out.println("Transfer Amount :");
				double transAmount=scanner.nextDouble();
				System.out.println("Enter other's account number :");
				String enteredOtherAccnum=scanner.next();
				
				if(transAmount>0 && transAmount<=balance && enteredOtherAccnum.equals(otherAccNum)) {
					balance -= transAmount;
					otherAcc += transAmount;
					System.out.println(transAmount + "has been transferred to account " + otherAccNum);
					System.out.println("Updated balance is " + balance);
					System.out.println("Other's updated balance is " + otherAcc);
				}else if (!enteredOtherAccnum.equals(otherAccNum)) {
                    System.out.println("Invalid other's account number");
                } else if (transAmount > balance) {
                    System.out.println("Insufficient balance");
                }
				else {
					System.out.println("Invalid transfer amount");
				}

				break;
				
			case 5:
				System.out.println("Exit");

				break;
			default:
				System.out.println("Invalid option");
				}
		}while(options!=5);
	
	scanner.close();
	}
}
		


			
			