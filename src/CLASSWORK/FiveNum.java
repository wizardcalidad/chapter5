import java.util.Scanner;

public class FiveNum{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int first = input.nextInt();

	System.out.print("Enter second integer: ");
	int second = input.nextInt();

	System.out.print("Enter third integer: ");
	int third = input.nextInt();

	System.out.print("Enter fourth integer: ");
	int fourth = input.nextInt();

	System.out.print("Enter fifth integer: ");
	int fifth = input.nextInt();

	int largest = first;

	if(second > largest){

		largest = second;

	}

	if(third > largest){
		largest = third;
}

	if(fourth > largest){
		largest = fourth;
}

	if(fifth > largest){
		largest = fifth;
}
	System.out.printf("The largest number is %d%n", largest);
}
 }
