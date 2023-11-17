package mercadonaPromotions;

public class Product {
	

	private String Product_Title;
    private String Product_Description;
    private double Product_Price;
    private String Product_Image;
    private String Cat_Title;
    private int Discount_Id;
    
    public Product (String Product_Title, String Product_Description, double Product_Price, String Product_Image, String Cat_Title, int Discount_Id) {

    	this.setProduct_Title(Product_Title);
    	this.setProduct_Description(Product_Description);
    	this.setProduct_Price(Product_Price);
    	this.setProduct_Image(Product_Image);
    	this.setCatTitle(Cat_Title);
    	this.setDiscount_Id(Discount_Id);
    	
    }

	public String getProduct_Title() {
		return Product_Title;
	}

	public void setProduct_Title(String product_Title) {
		Product_Title = product_Title;
	}

	public String getProduct_Description() {
		return Product_Description;
	}

	public void setProduct_Description(String product_Description) {
		Product_Description = product_Description;
	}
	
	public double getProduct_Price() {
		return Product_Price;
	}

	public void setProduct_Price(double product_Price) {
		Product_Price = product_Price;
	}
	
	public String getProduct_Image() {
		return Product_Image;
	}

	public void setProduct_Image(String product_Image) {
		Product_Image = product_Image;
	}

	public String getCat_Title() {
		return Cat_Title;
	}

	public void setCatTitle(String cat_Title) {
		Cat_Title = cat_Title;
	}

	public int getDiscount_Id() {
		return Discount_Id;
	}

	public void setDiscount_Id(int discount_Id) {
		Discount_Id = discount_Id;
	}
    
    

}
