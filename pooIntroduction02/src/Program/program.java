package Program;
import Product.product;
import java.util.Scanner;


public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		product product = new product();
		System.out.println("Enter Product Name: ");
		product.name = sc.next();
		System.out.println("Enter Quantity in Stock: ");
		product.quantity = sc.nextInt();
		System.out.println("Enter Price of Item: ");
		product.price = sc.nextDouble();
		
		System.out.println(product.toString());
		
		System.out.println("Add Products (1) or Remove Products(2), End Program (0)");
		int option = sc.nextInt();
		
		if (option == 1) {
				System.out.println("Enter Quantity to Apply the changes: "); 
				int quantity = sc.nextInt();
				product.addProduct(quantity);
				System.out.println(product.toString());
				
		} else if (option == 2) {
				System.out.println("Enter Quantity to Apply the changes: "); 
				int quantity = sc.nextInt();
				product.removeProduct(quantity);
				System.out.println(product.toString());
				
		}
		
		sc.close();
		
	}
}
