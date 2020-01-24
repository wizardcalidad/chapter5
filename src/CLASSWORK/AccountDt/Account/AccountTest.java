
public class AccountTest{

	public static void main(String[] args){
		Account AccountObj = new Account ();
		AccountObj.setName("YahooNiBabalawo");
		System.out.println(AccountObj.getName());
		
		AccountObj.setBalance(15000000);
		AccountObj.setWithdraw();
		AccountObj.displayResult();
		//System.out.printf("Your balance is %f%n",AccountObj.getBalance());

	}




}

