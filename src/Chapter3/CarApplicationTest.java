package Chapter3;

public class CarApplicationTest {
    public static void main(String[] args) {
        Car car1 = new Car("toyota", "",500.0);
        Car car2 = new Car("mazda", "",500.0);
        double result =calculateTheDiscountOfFirstCar(car1);
        double result2 = calculateTheDiscountOfSecondCar(car2);
       double hey = car1.getPrice();
        System.out.println();
        double hy = car2.getPrice();

        System.out.println(result);
        System.out.println(result2);
        }
        public static double calculateTheDiscountOfFirstCar(Car car1){
            return car1.getPrice() -((double) 7 /100) * car1.getPrice();
        }
        public static double calculateTheDiscountOfSecondCar(Car car2){
        return car2.getPrice() -((double) 5/100) * car2.getPrice();
        }



    }

