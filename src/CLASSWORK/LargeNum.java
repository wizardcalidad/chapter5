import java.util.Scanner;

public class LargeNum{

public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int x = input.nextInt();

	System.out.print("Enter second integer: ");
	int y = input.nextInt();

	if(x > y){
	System.out.printf("%d is the larger number", x);
}
	if(y > x){
	System.out.printf("%d is the larger number", y);

}

}
}
