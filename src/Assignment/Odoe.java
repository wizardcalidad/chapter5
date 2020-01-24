import java.util.Scanner;

public class Odoe{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.print("Enter for the integer: ");
	int x = input.nextInt();

	if ( x % 2 == 0){

	System.out.printf("%d%n is an even number", x);

	}

	if ( x % 2 != 0){

	System.out.printf("%d%n is an odd number" , x);
	}

	
}

 }
