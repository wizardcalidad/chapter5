import java.util.Scanner;

public class Islarge{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int m;
	int n;


	System.out.print("Enter first integer: ");
	m = input.nextInt();

	System.out.print("Enter second integer: ");
	n = input.nextInt();


	if(m>n)
	System.out.printf("%d is larger than %d%n", m, n);

	if(m==n)
	System.out.printf("%d is equal to %d%n", m, n);

	if(m<n)
	System.out.printf("%d is less than %d%n", m, n);
	

}


}
