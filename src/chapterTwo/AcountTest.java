import java.util.Scanner;

class Acount{

	private String name;

	public void setName(String name){

	this.name = name;
}

	public String getName(){

	return name;
}

}

public class AcountTest{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	Acount myAcount = new Acount();

	System.out.println("Please enter your name: ");
	String theName = input.nextLine();

	myAcount.setName(theName);
	System.out.println();

	System.out.printf("Name in myAcount is: %n%s%n", myAcount.getName());

}


}
