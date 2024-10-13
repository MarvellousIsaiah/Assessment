package premiumTask;

public class Sam implements Bungalow {
    @Override
    public void door() {
        System.out.println("Access 2");
    }

    @Override
    public String window() {
        return "ventilation 2";
    }
}
