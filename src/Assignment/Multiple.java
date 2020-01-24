import java.util.Scanner;

public class Multiple{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int x = input.nextInt();

	System.out.print("Enter second integer: ");
	int y = input.nextInt();

	if ( y % x == 0){

	System.out.printf("%d is a multiple of %d%n", x, y);

	}

	if ( y % x != 0){

	System.out.printf("%d is not a multiple of %d%n", x, y);
	}

	
}

 }
