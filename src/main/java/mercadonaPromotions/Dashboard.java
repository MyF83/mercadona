package mercadonaPromotions;

import java.util.Scanner;

public class Dashboard {
	
	private Product [] productList = new Product[3] ;
	static Scanner input = new Scanner(System.in);
	
	
	public Product createNewProduct() {
		String Product_Title = null;
		String Product_Description = null;
		double Product_Price = 0.00;
		String Product_Image= null;
		String Cat_Title= null;
		int Discount_Id=0;
		
		while (Product_Title == null | Product_Description == null | Product_Price == 0.00 | Product_Image == null | Cat_Title == null | Discount_Id ==0) {
			System.out.print("Title of the product : ");
			Product_Title = input.nextLine();
			
			System.out.print("Description of the product : ");
			Product_Description = input.nextLine();
			
			System.out.print("Image of the product : ");
			Product_Image = input.nextLine();
			
			System.out.print("Category of the product : ");
			Cat_Title = input.nextLine();
			
			System.out.print("Percentage of discount : ");
			Discount_Id = input.nextInt();
			
			System.out.print("Price of the product : ");
			Product_Price = input.nextDouble();
		}
				
		return new Product (Product_Title, Product_Description, Product_Price, Product_Image, Cat_Title, Discount_Id);
	}
	
	public void addToCatalog() {
		
		for (int x=0; x < productList.length; x++) {
			if (productList[x] == null) {
				productList[x]= createNewProduct();
				x = productList.length;
				break;
			}
		}
	}
	
	public void printAll() {
		
		for (int x = 0 ; x < productList.length; x ++) {
			if ( productList[x] != null) {
				System.out.println("Numéro : " + (x+1) + "Nom : " + productList[x].getProduct_Title() );
				
			}
			
		}
	}
}
