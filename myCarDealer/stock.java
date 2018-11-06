package MyCarDealer;

public class stock {
	
	String companyName;
	int carPrice;
	int numberOfCars;

	public stock(String companyName, int price, int numberOfCars) {
	    super();
	    this.companyName = companyName;
	    this.carPrice = price;
	    this.numberOfCars = numberOfCars;
}

	public String getCompanyName() {
	    return companyName;
	}

	public int getNumberOfShares() {
	    return numberOfCars;
	}

	public int getPrice() {
	    return carPrice;
	}
}