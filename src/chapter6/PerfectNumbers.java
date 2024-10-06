package chapter6;

public class PerfectNumbers {
private String name;
public String getName(){
    return name;
}

public static String MyName = "marv";
    public static String getFactors(int number) {
        String factor = " ";
        for (int index = 1; index < number; index++) {
            if (number % index == 0) {
                factor = factor + " " + index + ",";
            }
        }
        return factor;
    }

    public static void main(String[] args) {
        System.out.println(getFactors(56));
        System.out.println(sumNumbers(56));

    }

    public static int sumNumbers(int num) {
        int sum = 0;
        for (int index = 1; index < num; index++) {
            if (num % index == 0) {
                sum +=index;
            }
        }
        return sum;
    }

    public static void perfectNumbers(int num){
        int sumNumber = 0;
        for (int index = 1; index < num; index++) {
            if(num % 1 == 0){
                System.out.println("it's a perfect number");
            }else {
                System.out.println("not a perfect number");
            }

        }

        }


}


 