package premiumTask;

public class Marvellous implements Bungalow {
    @Override
    public void door() {
        System.out.println("Access 1");
    }

    @Override
    public String window() {
        return "ventilation 1";
    }
}
