package Chapter3;

import org.w3c.dom.ls.LSOutput;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;

    public Clock(int hour, int minute, int seconds){
        if(hour > 23 || minute > 59 || seconds > 59) {
            this.hour = 0;
            this.minute = 0;
            this.seconds = 0;
        }else {
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
        }
    }

    public void setHour(int hour){
        if(hour > 23) {
            this.hour = 0;
        }else {
            this.hour = hour;
        }
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        if(minute > 59) {
            this.minute = 0;
        }else {
            this.minute = minute;
        }
    }
   public int getMinute(){
    return minute;
    }
    public void setSeconds(int seconds){
        if(seconds > 59) {
            this.minute = 0;
        }else {
            this.seconds = seconds;
        }
    }
    public int getSeconds(){
        return seconds;
    }
    public String displayTime(){
        return String.format("02d:02d:02d", hour,minute,seconds);
    }

}

