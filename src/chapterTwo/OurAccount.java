public class OurAccount{

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




}
