package Chapter3;

public class PetrolPurchase {
   private String location;
   private String petrol;
   private int quantity;
   private double pricePerLitre;
   private double discount;

   public PetrolPurchase(String location,String petrol, int quantity,double pricePerLitre,double discount){
    this.petrol = petrol;
    this.location = location;
    this.discount = discount;
    this.pricePerLitre = pricePerLitre;
    this.quantity = quantity;
   }


   public void setPetrol(String petrol){
       this.petrol = petrol;
   }
   public String getPetrol(){
       return petrol;
   }
   public void setLocation(String location){
       this.location = location;
   }
   public String getLocation(){
       return location;
   }

   public void setPricePerLitre(double price){
       this.pricePerLitre = pricePerLitre;
   }
   public double getPricePerLitre(){
       return pricePerLitre;
   }

   public void setQuantity(int quantity){
       this.quantity = quantity;
   }
   public int getQuantity(){
       return quantity;
   }

   public void setDiscount(double discount){
       this.discount =discount;
   }
   public double getDiscount(){
       return discount;
   }

   public double getPurchase(double discount, double pricePerLitre,int quantity){
        double netAmount = quantity * pricePerLitre;
       return netAmount - (discount/100);

      // return quantity * pricePerLitre;

   }

    public double getPurchase(int i) {
        return 0;
    }
}
