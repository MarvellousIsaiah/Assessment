package Chapter3;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model,String year, double price){
        this.model=model;
        this.price=price;
        this.year=year;
    }

    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void  setYear(String year){
        this.year=year;
    }
    public String getYear(){
        return year;
    }
    public void setPrice(double price){
        if(price <= 0){ System.out.println("price is less than zero");
        }else {
            this.price=price;
        }



    }
    public double getPrice(){
        return price;
    }
}
