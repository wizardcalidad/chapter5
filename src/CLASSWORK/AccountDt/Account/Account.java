import java.util.Scanner;


 class Account{

		private String name;
		private double balance;
		private double newBalance;
		private double amount;

	
		public void setName(String name){
			this.name = name;	
		}
	
		public String getName(){
			return name;
		}
		
		public void setBalance(double balance){
			this.balance = balance;
		}

		

		public double getBalance(){
			return balance;
		}
		
		public void setWithdraw(){
		Scanner input = new Scanner(System.in);
		System.out.print("Amount to withdraw: ");
		double amount = input.nextDouble();
		newBalance = balance - amount;
		}

		public double getWithdraw(){
			return newBalance;
		}

		public void displayResult(){
		double balance = getBalance();
		double newBalance = getWithdraw();
		System.out.print(AccountObj.getWithdraw());
		}
}
