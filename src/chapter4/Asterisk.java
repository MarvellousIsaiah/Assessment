package chapter4;

public class Asterisk {

    public static String printStars(int noOfStars){
        String star = "";
        for (int i = 0; i < noOfStars; i++) {
             star+="* ";
        }
        return star += "\n";
    }

    public static void main(String[] args) {
                System.out.println(
                        printStars(8)+" "+printStars(8)+printStars(8)+" "+printStars(8)+" "+printStars(8)+printStars(8)+" "+printStars(8)+printStars(8)
                );
    }


}
