import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kruti Patel
 * @date 08/10/2020
 */
public class BankingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj1 = new BankAccount("XYZ", "BA00001");
		obj1.showMenu();
	}

}

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cId) {
		customerName = cname;
		customerId = cId;
	}
	
	void deposit(int amount) {
		if(amount != 0 ) {
			balance -= amount;
			previousTransaction = amount;
			
		}
		
	}
	
	void getPreviousTransaction() {
		//if greater than 0 > deposited
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);	
		}
		//if less than 0 < then withdrew 
		else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		//if other than no activity
		else {
			System.out.println("No transaction occured.");
		}
		
	}
	
	void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("============================");
			System.out.println("Enter an option");
			System.out.println("============================");
			option = scanner.next().charAt(0);
			System.out.println("\n");

			switch(option) {
			case 'A': //balance
				System.out.println("============================");
				System.out.println("Balance= " + balance);
				System.out.println("============================");
				System.out.println("\n");
				break;
			
			case 'B': //deposit
				System.out.println("============================");
				System.out.println("Enter amount to deposit:");
				System.out.println("============================");
				int amount  = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C': //withdraw
				System.out.println("============================");
				System.out.println("Enter amount to withdraw:");
				System.out.println("============================");
				int amount2  = scanner.nextInt();
				deposit(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("============================");
				getPreviousTransaction();
				System.out.println("============================");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("============================");
				break;
				
			default:
				System.out.println("Invalid option!! Please enter valid option again");
				break;
			}	
		}while(option != 'E');
			
		System.out.println("Thank you for using our service");
	}
			
			

}

	
	