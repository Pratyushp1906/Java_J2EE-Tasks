package wipro.com.polymorphism;

public class Premium_Customer extends Customer {
	@Override
        public double calculateDiscount(double purchaseAmount) {
         return purchaseAmount * 0.2; 
    }
}
