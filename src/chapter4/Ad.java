public class Ad{
	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		int product = 2;
		int c = 5;

		while(x<=10)
		{
			sum = sum + x;
			++x;
		}
		System.out.println(sum);

		while (c <= 5) 
		{
 				product *= c;
 				++c;
 			}
 			System.out.println(product);
	}
	
}