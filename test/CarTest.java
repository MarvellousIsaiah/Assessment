import Chapter3.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test

    public void testThatCanCreatNewObjectUsingConstructor(){
//        given
        Car car = new Car("mazda","2020",5000.00);
//        when
        double carPrice = car.getPrice();
        String carYear = car.getYear();
        String carModel = car.getModel();
//        assert
        assertEquals(carPrice, 5000.00);
        assertEquals(carYear, "2020" );
        assertEquals(carModel, "mazda");
    }

    @Test
    public void testThatYouCanSetAndGetTheCarInstanceVeriables(){
        Car car = new Car("mazda", "2020", 5000.00);
        car.setModel("volt");
        car.setYear("2025");
        car.setPrice(20000.00);

       assertEquals(car.getPrice(), 20000.00);
        assertEquals(car.getYear(), "2025");
        assertEquals(car.getModel(),"volt");
    }

    @Test

    public void testThatNegativePriceValuesCanNotBeSet(){
        Car car = new Car("madza","2020", 5000.00);
        car.setPrice(-2000.00);
        assertEquals(5000.00,car.getPrice());
    }
}
