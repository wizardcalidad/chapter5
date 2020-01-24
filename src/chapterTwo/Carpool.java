import java.util.Scanner;

public class Carpool{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int a; // Total miles driven per day
	int b; //Cost per gallon of gasoline
	int c; // Average miles per gallon
	int d; // Parking fees per day
	int e; // Tolls per day
	int f; // Daily driving cost

	System.out.println("What's your total miles driven per day: ");
	a = input.nextInt();

	System.out.println("How much is a gallon of gasoline: ");
	b = input.nexInt();

	System.out.println("What's the average miles covered per gallon: ");
	c = input.nextInt();

	System.out.println("How much is spent on parking per day: ");
	d = input.nextInt();

	System.out.println("How much is spent on tolls per day: ");
	e = input.nextInt();

	f = ((a/c) * b) + (d+e);
	System.out.printf("Your daily driving cost is %d%n", f);




	


}




}	
