package premiumTask;

public class House {
    private String window;
    private String door;
    private String location;
    private int houseNumber;
    private double houseMoney;
//    private String color;
    public House(String window, String door, String location, double houseMoney, int houseNumber) {
        this.window = window;
        this.door = door;
        this.location = location;
//        this.color = color;
        this.houseMoney=houseMoney;
        this.houseNumber=houseNumber;
    }
    private void displayDetails() {
        System.out.println("window = " + window);
        System.out.println("door = " + door);
        System.out.println("location = " + location);
        System.out.println("houseMoney = " + houseMoney);
        System.out.println("houseNumber = " + houseNumber);

    }

    @Override
    public String toString() {
        return "House{" +
                "window='" + window + '\'' +
                ", door='" + door + '\'' +
                ", location='" + location + '\'' +
                ", houseNumber=" + houseNumber +
                ", houseMoney=" + houseMoney +
                '}';
    }

    public void showDetails(){
        displayDetails();
    }

    public static void main(String[] args) {
        House house =new House("window","door","location",50.00,8);
        String window = house.window;

    }



}
