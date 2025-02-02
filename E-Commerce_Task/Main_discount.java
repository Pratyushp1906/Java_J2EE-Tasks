package wipro.com.polymorphism;

public class Main_discount {
	     public static void main(String[] args) {
    
           Customer rc = new Regular_Customer();
           Customer pc = new Premium_Customer();
           Customer e = new Employee();
        
           double purchaseAmount = 3999;

           System.out.println(rc.calculateDiscount(purchaseAmount));
           System.out.println(pc.calculateDiscount(purchaseAmount));
           System.out.println(e.calculateDiscount(purchaseAmount));
    }
}
