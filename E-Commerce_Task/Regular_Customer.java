package wipro.com.polymorphism;

public class Regular_Customer extends Customer {
	 @Override
	    public double calculateDiscount(double purchaseAmount) {
	     return purchaseAmount * 0.1;
	    }
}

