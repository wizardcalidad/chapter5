import java.util.Scanner;


class Withdraw { 
	private double withdraw;
	private double balance;
	
	public Withdraw(double withdraw){

		this.withdraw = withdraw;

		this.balance = 15000;
		}

	public double withdraw(double withdrawalAmount){

		if (balance < withdrawalAmount){
		
		System.out.printf("Withdrawal amount exceeded account balance, %.2f%n", balance);
		}
		if (balance > withdrawalAmount){
		balance = balance - withdrawalAmount;
		}
		return balance;
	}

	public double getBalance(){
		return balance;
	}


}
public class WithdrawTest {


public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.println("Enter amount to withdraw: ");
	double withdrawalAmount = input.nextDouble();

	System.out.printf("You request to withdraw %.2f%n",withdrawalAmount);

	System.out.println("Enter amount to deposit: ");
	double depositAmount = input.nextDouble();

	System.out.printf("You are about to deposit %.2f%n",depositAmount);
	

	Withdraw withdrawObj = new Withdraw(withdrawalAmount);
	Deposit myDeposit = new Deposit(depositAmount);

	withdrawObj.withdraw(withdrawalAmount);
	System.out.printf("Your balance is %.2f%n", withdrawObj.getBalance());

	myDeposit.deposit(depositAmount);
	System.out.printf("Your balance is %.2f%n", myDeposit.getBalance());

	

	
	
	
	}
}

	class Deposit {
	      private double balance;
	      private double deposit;

		/*Withdraw myWithdraw = new Withdraw(double balance);
		myWithdraw.getbalance(double deposit); */

		public Deposit (double deposit){
		
		this.deposit = deposit;

		this.balance = balance;
		}

	public double deposit(double depositAmount){

	balance = depositAmount + balance;
	return balance;
}

	public double getBalance(){
		return balance;
	}

}
