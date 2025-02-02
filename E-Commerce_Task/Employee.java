package wipro.com.polymorphism;

public class Employee extends Customer {
	@Override
    public double calculateDiscount(double purchaseAmount) {
    return purchaseAmount * 0.3; 
    }
}
