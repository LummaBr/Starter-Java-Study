package Product;

public class product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueStock() {
			
		double total = price * quantity;
		return total;
	}
		
	public void addProduct(int quantity ) {
		this.quantity += quantity;
		
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ "units, Total: $"
				+ String.format("%.2f", totalValueStock());
	}
}
