package classes;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRate(String firstName,String lastName, int dateOfBirth, int monthOfBirth, int yearOfBirth){
              this.firstName=firstName;
              this.lastName=lastName;
              this.dateOfBirth=dateOfBirth;
              this.monthOfBirth=monthOfBirth;
              this.yearOfBirth=yearOfBirth;


    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDateOfBirth(int dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public int getDateOfBirth(){
        return dateOfBirth;
    }
    public void setMonthOfBirth(int monthOfBirth){
        this.monthOfBirth=monthOfBirth;
    }
    public int getMonthOfBirth(){
        return monthOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth=yearOfBirth;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }




}
