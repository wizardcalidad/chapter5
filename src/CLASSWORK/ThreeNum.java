import java.util.Scanner;

public class ThreeNum{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int first = input.nextInt();

	System.out.print("Enter second integer: ");
	int second = input.nextInt();

	System.out.print("Enter third integer: ");
	int third = input.nextInt();

	int largest = first;
	int position = 1;

	if(second > largest){

		largest = second;
		position = 2;

	}

	if(third > largest){
		largest = third;
		position = 3;
}

	System.out.printf("The largest number is %d%n", largest);
	System.out.printf("At position %d%n", position);
}
 }
