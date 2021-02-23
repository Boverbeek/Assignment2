
public class Items {
	Product product;
	Services services;
	Subscriptions subscriptions;
	
	
	public Items (Product product, Services services, Subscriptions subscriptions) {
		this.product = product;
		this.services = services;
		this.subscriptions = subscriptions;
	}


	public Product getProduct() {
		return product;
	}


	public Services getServices() {
		return services;
	}


	public Subscriptions getSubscriptions() {
		return subscriptions;
	}
	
}
