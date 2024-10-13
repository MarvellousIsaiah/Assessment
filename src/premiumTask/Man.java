package premiumTask;

public class Man {
    public String head;
    public String face;
    private String leg;
    private static String hands;
    private String stomach;



    public Man(String head, String face, String leg, String hands, String stomach) {
        this.head = head;
        this.face = face;
        this.leg = leg;
        this.hands = hands;
        this.stomach = stomach;
    }

    @Override
    public String toString() {
        return "Man{" +
                "head='" + head + '\'' +
                ", face='" + face + '\'' +
                ", leg='" + leg + '\'' +
                ", stomach='" + stomach + '\'' +
                '}';
    }

//    public Man() {
//
//    }

    public static void eat(){
        System.out.println("i can eat ");
    }
}
