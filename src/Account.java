import java.util.Scanner;


public class Account{

	public static void main(String...args){
	Bank bankObj = new Bank();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter account balance");
	double val = input.nextDouble();
	bankObj.setAccountBalance(val);
	boolean status = bankObj.getLoan();
	if(status == true){
	System.out.println("Your loan has been approved");
	}
	else{
	System.out.println("Your loan was disapproved, low balance");	
	}

   }

}

class Bank{

	private double accountBalance;

	public void setAccountBalance( double accountBalance){
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance(){
	return accountBalance;
}

	public boolean getLoan(){
		if(getAccountBalance() >=100.0){
			return true;
}
	else{
		return false;
}
}

}
