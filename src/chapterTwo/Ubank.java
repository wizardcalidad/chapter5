import java.util.Scanner;

class Ubanking{

	private String name;
	private double accountNumber;
	private double accountBalance;
	private String bankName;

	public Ubanking (double accountNumber,String bankName) {
	this.bankName = bankName;
	this.accountNumber = accountNumber;
	}

	public void setName(){
	this.name = "Java Scholar";
	}

	public String getName(){
	return name;		
	}

	public void setBankName(){
	this.bankName = "UBA";	
	}


	public String getBankName() {
	return bankName;
	}

	public void setAccountNumber( double accountNumber){
	this.accountNumber = accountNumber;	
	}

	public double getAccountNumber( double accountNumber) {
	return accountNumber;
	}

	public boolean checkBankName(String bankName){
		if(getBankName() == bankName){
		return true;
		}
		else{ 
		return false;
		}
	}

	public void setAccountBalance(){
		this.accountBalance = 10000;	
	}
	
	public double getAccountBalance(){
	return accountBalance;
	}


	public boolean checkAccountNumber(double accountNumber){
		if(getAccountNumber(accountNumber) == 2060633910){
		return true;	
		}
		else{
		return false;	
		}
	}
	
	public String withdraw( double withdraw){
	if(withdraw <= getAccountBalance()){
		
	return "Have your cash thanks for banking with us";
	}
	else{

	return "insufficient balance, try again later";	
	}

	}
	

}

public class Ubank{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your Bank Name: ");
		String bankName = input.nextLine();
		
		System.out.println("Enter Account Number: ");
		double accountNumber = input.nextDouble();
		
		
		System.out.println("Enter amount to withdraw: ");
		double withdraw = input.nextDouble();
		
		Ubanking myUbank = new Ubanking(accountNumber,bankName);
		myUbank.setName();
		myUbank.setAccountBalance();
		myUbank.setAccountNumber(accountNumber);

		if(myUbank.checkBankName(bankName) && myUbank.checkAccountNumber(accountNumber)){
			System.out.println(myUbank.withdraw(withdraw));
		
		}
		else{
			System.out.println("ole a ji gbole");
		}
		
	
		
	}

}


