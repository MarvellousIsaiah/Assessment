package Chapter3;

public class ClockTest {
    public static void main(String[] args) {

//        Clock clock1 = new Clock(4,30,20);
//        Clock clock2 = new Clock(8,20,10);
//
//    }
//    public static int checkIfTheHourIsGreaterThan(Clock clock1){
//        if( clock1.getHour() > 23)return 0;
//        return clock1.getHour();
//    }
//    public static int checkIfMinuteIsGreaterThan(Clock clock2){
//        if(clock2.getMinute() > 59 )return 0;
//        return clock2.getMinute();
//    }
//
//    public static int checkIfSecondsIsGreaterThan(Clock clock1){
//        if (clock1.getSeconds() > 59)return 0;
//        return clock1.getSeconds();
//    }
//
//    private static void displayClock(Clock clock1){
//        System.out.println("");
//    }
//
        Clock clock = new Clock(12, 30, 45);
        System.out.println("initial time:" + clock.displayTime());

        clock.setHour(25);
        clock.setMinute(20);
        clock.setSeconds(30);
        System.out.println("invalid value:" + clock.displayTime());

        clock.setHour(10);
        clock.setSeconds(20);
        clock.setSeconds(30);
        System.out.println("setting valid value:" + clock.displayTime());
    }
}

