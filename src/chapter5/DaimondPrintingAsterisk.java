package chapter5;



public class DaimondPrintingAsterisk {
    public static String printStars(int noOfStars) {
        String star = "";
        for (int i = 0; i < noOfStars; i++) {
            star += "* ";
        }
        return star += "\n";
    }

    public static void main(String[] args) {
        System.out.println(
                "   "+printStars(1)+"  "+
                  ""+printStars(3)+
                   printStars(5) +
                  "  " + printStars(3) + " " +
                 "   " + printStars(1) + "  ");
        //  System.out.println(
        //         printStars(1) + printStars(3) + printStars(5) + printStars(7) + printStars(9) + printStars(7) + printStars(5) + printStars(3) + " " + printStars(1));
    }
}














