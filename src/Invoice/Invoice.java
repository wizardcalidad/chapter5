import java.util.Scanner;


public class Invoice{

			private String partNumber;
			private String partDescription;
			private int itemQuantity;
			private int itemPrice;

		Scanner input = new Scanner(System.in);

	public Invoice(String partNumber, String partDescription, int itemQuantity, int itemPrice){

			this.partNumber = partNumber;
			this.partDescription = partDescription;
			this.itemQuantity = itemQuantity;
			this.itemPrice = itemPrice;
	}	

	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
	}
	public String getPartNumber(){
		return partNumber;
	} 

	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;
	}
	public String getPartDescription(){
		return partDescription;
	}
	public void setItemQuantity(int itemQuantity){
		this.itemQuantity = itemQuantity;
	}
	public int getItemQuantity(){
		return itemQuantity;
	}  
	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}
	public int getItemPrice(){
		return itemPrice;
	}

	/*public void setPartNumber(){
		System.out.println("Select one for Computer parts\nSelect two fo other parts\n");
		partNumber = input.nextLine();
		if(partNumber== one){
			System.out.println("You're about to buy some computer parts\npress A for monitors\nB for CPU\nC for keyboard\nE for mouse\nF for speaker");
			String partDescription = input.nextLine();
		}
		if(partNumber== two){
			System.out.println("Sorry! Part chosen not available");
			setPartNumber();
		}
	}

	public String getPartNumber(){
		return partDescription;
	}

	public void setPartDescription(){
		if(partDescription==A){
			System.out.println("press A1 for lead screen monitor\nA2 for a plasma screen\n");
			String partDesc = input.nextLine();
		}
	}


	public String getPartDescription(){
		return partDesc;
	}

	public void setItemQuantity(){
		System.out.println("In what quantity are you buying?: ");
		int itemQuantity = input.nextInt();
	}

	public int getItemQuantity(){
		return itemQuantity;
	}

	public void setItemPrice(){
			A1 = $10;
			A2 = $15;
		if(partDesc == A1 || A2){
			System.out.println("Enter the price: ");
			int price = input.nextInt();

			itemPrice = itemQuantity * price;


		}
	}

	public int getItemPrice(){
		return itemPrice;
	}
*/


}