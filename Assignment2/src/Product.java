
public class Product {
	String code;
	String type;
	String name;
	double basePrice;
	
	public Product (String code, String type, String name, double basePrice) {
		this.code = code;
		this.type = type;
		this.name = name;
		this.basePrice = basePrice;
	}

	public String getCode() {
		return code;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public double getBasePrice() {
		return basePrice;
	}
	
}
