package Ay;

public class TruncateDouble {
    public static void main(String[] args) {
        //String text = "hello world";
        //BigDecimal bd = new BigDecimal(num);
        double num = 5000.250;
        int truncatedInt = (int) num;
        double  truncatedDouble = (double) truncatedInt;

        System.out.println("num:" + num);
        System.out.println("truncatedInt:" + truncatedInt);
        System.out.println("truncatedDouble:" + truncatedDouble);

    }
}
