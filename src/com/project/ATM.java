package com.project;

import java.util.Scanner;

public class ATM {
	 private BankAccount account;
	    

	    public ATM(BankAccount account) {
	        this.account = account;
	        
	    }
	Scanner sc=new Scanner(System.in);
		public void Menu() {
			while(true) {
				System.out.println("Select an option : ");
				System.out.println("1.Check Balance");
				System.out.println("2.Deposit");
				System.out.println("3.Withdraw");
				System.out.println("4.Exit");
				
				int option = sc.nextInt();
			
				switch(option) {
				case 1:
					checkbalance();
					break;
				case 2:
					deposit();
					break;
				case 3:
					withdraw();
					break;
				case 4:
					System.out.println("Succesfully exited!!");
					break;
				default:
					System.out.println("Enter valid option!!");
				}
			}
		}
		private void checkbalance() {
	        System.out.println("Your current balance is: " + account.getBalance());
	    }

	    private void deposit() {
	        System.out.print("Enter the amount to deposit: ");
	        double amount = sc.nextDouble();
	        account.deposit(amount);
	    }

	    private void withdraw() {
	        System.out.print("Enter the amount to withdraw: ");
	        double amount = sc.nextDouble();
	        account.withdraw(amount);
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(10000); 
	        ATM atm = new ATM(account);
	        atm.Menu();
	    }
	
}
