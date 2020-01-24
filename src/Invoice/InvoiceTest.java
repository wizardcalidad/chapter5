public class InvoiceTest{

	public static void main(String[] args) {
		Invoice InvObj = new Invoice("A0001", "Laptop Charger", 1, 5000);
		Invoice InvObj1 = new Invoice("A0002", "Laptop Battery", 2, 15000);
		Invoice InvObj2 = new Invoice("A0003", "Laptop Screen", 1, 25000);
		Invoice InvObj3 = new Invoice("A0004", "Laptop Keyboard", 1, 35000);

		
	System.out.printf("Name:\nPart Number\t Part Description\t Item Quantity\t Item Price($)%n");
	System.out.printf("Mercy Olawale:\n%s\t%s\t%d\t%d%n",InvObj.getPartNumber(),InvObj.getPartDescription(),InvObj.getItemQuantity(),InvObj.getItemPrice());
	System.out.printf("Dayo Olaifa:\n%s\t%s\t%d\t%d%n",InvObj1.getPartNumber(),InvObj1.getPartDescription(),InvObj1.getItemQuantity(),InvObj1.getItemPrice());
	System.out.printf("Splendour Olatunde:\n%s\t%s\t%d\t%d%n",InvObj2.getPartNumber(),InvObj2.getPartDescription(),InvObj2.getItemQuantity(),InvObj2.getItemPrice());
	System.out.printf("Wizard Calidad:\n%s\t%s\t%d\t%d%n",InvObj3.getPartNumber(),InvObj3.getPartDescription(),InvObj3.getItemQuantity(),InvObj3.getItemPrice());

	}


}