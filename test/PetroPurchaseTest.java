import Chapter3.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetroPurchaseTest {
    @Test
    public void testThatYouCanSetAndGetTheClassInstanceVariables() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("lagos", "premium",50, 5000.00,10);
        petrolPurchase.setPetrol("premium");
        petrolPurchase.setDiscount(5.00);
        petrolPurchase.setLocation("lagos");
        petrolPurchase.setPricePerLitre(5000.00);
        petrolPurchase.setQuantity(10);

        String petrol = petrolPurchase.getPetrol();
        String location = petrolPurchase.getLocation();
        Double discount = petrolPurchase.getDiscount();
        Double pricePerLitre = petrolPurchase.getPricePerLitre();
        int quantity = petrolPurchase.getQuantity();

        assertEquals(petrol, "premium");
        assertEquals(location,"lagos");
        assertEquals(discount, 5.00);
        assertEquals(pricePerLitre,5000.00);
        assertEquals(quantity,10);
    }
    @Test
    public void testGetPurchaseMethodCanCalculateTheNetPurchaseAmount(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("lagos","premium", 50, 5000.00, 10);
        double actualAmount = 50 * 200.00
                -(200.00 * 10.0/ 100);
       assertEquals(actualAmount, petrolPurchase.getPurchase(10));


    }
}


