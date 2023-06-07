package Product;

class Product{
	
	double price;
	String name;
	int quantity;
	int totalProductQuantity;
	
	public Product(String name, double price, int quantity) {
		this.price=price;
		this.name=name;
		this.quantity=quantity;
		this.totalProductQuantity=quantity;
	}
	
	void sell(int quantity) {
		
		if(this.quantity>quantity) {
			this.quantity=this.quantity-quantity;	
			System.out.println("Name: "+ this.name +" | Total Price: "+ this.price*quantity +" | Quantity: "+quantity);
		}
		else {
			System.out.println("=============================================");
			System.out.println("SORRY!!!! Insufficient Product Quantity");
			System.out.println("Quantity Left: "+ this.quantity);
			System.out.println("=============================================");
		}
		
	}
	
	void getTotalSold() {
		System.out.println("=============================================");
		System.out.println("Total Number Of Product Sold: "+ (this.totalProductQuantity-this.quantity));
		System.out.println("=============================================");
	}
}

public class ProductDemo {

	public static void main(String[] args) {
		Product p1 = new Product("Pencil",12,20);
		Product p2 = new Product("Eraser",20,30);
		Product p3 = new Product("Sharpner",32,15);
		
		p1.sell(2);
		p1.sell(5);
		p1.sell(10);		
		p1.getTotalSold();	
		p1.sell(20);
		
		
		p2.sell(2);
		p2.sell(5);
		p2.getTotalSold();	
		
		
		p3.sell(2);
		p3.sell(12);
		p3.getTotalSold();	
		
		
	}

}
