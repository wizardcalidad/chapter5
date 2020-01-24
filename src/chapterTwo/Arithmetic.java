import java.util.Scanner;

public class Arithmetic{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int x = input.nextInt();

	System.out.print("Enter second integer: ");
	int y = input.nextInt();

	System.out.print("Enter third integer: ");
	int z = input.nextInt();

	int sum = x + y + z;	
	int avg = sum / 3 ;
	int product = x * y * z;

	
	System.out.printf("Sum is %d%n", sum);	
	System.out.printf("Average is %d%n", avg);
	System.out.printf("Product is %d%n", product);		

	int largest = x;

	if(y > x){
		largest = y;
	}

	if(z > y){
		largest = z;
	}

	System.out.printf("The largest number is %d%n", largest);
	System.out.println();

	int smallest = x;

	if(y < x){
		smallest = y;
	}

	if(z < y){
		smallest = z;
	}

	System.out.printf("The smallest number is %d%n", smallest);
}


	}
