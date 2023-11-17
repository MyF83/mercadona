package mercadonaPromotions;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MercadonaPromotionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercadonaPromotionsApplication.class, args);
		
		Product product = new Product ("Wine bottle", "New french wine from south of France", 9.55, "https://cdn.pixabay.com/photo/2019/10/29/10/36/wine-4586619_1280.jpgm", "Wines", 0 );
		
		System.out.println("Titre du produit : " + product.getProduct_Title() + " - Prix du produit : " + product.getProduct_Price());
		
		Dashboard dashboard = new Dashboard();
		dashboard.addToCatalog();

		dashboard.addToCatalog();
		
		dashboard.printAll();
	}
	
	

}
