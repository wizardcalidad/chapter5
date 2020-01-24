import java.util.Scanner;


 class OurAccount{

	private String name;
	private double balance;
//these are the attributes of the class OurAccount

	public OurAccount(String name, double balance){

		this.name = name;
		
		if (balance > 0.0)
		this.balance = balance;
	}

	public void deposit(double depositAmount){

		if (depositAmount > 0.0)
		balance = balance + depositAmount;
	}
//method that deposits only if the amount is valid

	public double getBalance(){
	
		return balance;	
	}
//method that return the account balance

	public void setName(String name){

		this.name = name;	
	}//this sets the name

	public String getName(){

		return name;	
	}// this returns name

public class OurAccountTest {

public static void main(String[] args) {

		OurAccountTest account1 = new Account();
		OurAccountTest account2 = new Account();
	
		/*System.out.printf("%s balance: $%.2f%n", account1.getName(), 			account1.getBalance());

		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), 			account2.getBalance());
		//this display initial balance of each object
		*/
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
	System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);//add to account1's balance

		
		System.out.printf("%s balance: $ %.2f %n",
		account1.getName(), account1.getBalance() );
		System.out.printf("%s balance: $ %.2f %n%n",
		account2.getName(), account2.getBalance() );

		System.out.print("Enter deposit amount for account2: ");
		double depositAmount = input.nextDouble();
	System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);//add to account2's balance

		System.out.printf("%s balance: $ %.2f %n",
		account1.getName(), account1.getBalance() );
		System.out.printf("%s balance: $ %.2f %n%n",
		account2.getName(), account2.getBalance() );
	}
}

