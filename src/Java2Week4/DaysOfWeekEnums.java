package Java2Week4;

import java.util.Scanner;

public class DaysOfWeekEnums {
 public static void main(String[]args){
    new DayOfWeek(Days.FRIDAY).testDay();
    for(Days d:Days.values()){
        System.out.println(d.getName());
    }
 }
}
class DayOfWeek{
    Days d;
    DayOfWeek(Days d){
        this.d=d;
    }
    public void testDay(){
    switch(d){
        case SUNDAY:
            System.out.println("Sunday is todays day");
            break;
        case MONDAY:
            System.out.println("Monday is todays day");
            break;
        case TUESDAY:
            System.out.println("Tuesday is todays day");
            break;
        case WEDENSDAY:
            System.out.println("todays day is wedensday");
            break;
        default:
            System.out.println("i can't be bothered to make the other cases");
            break;
    }
    }
}


enum Days{
    SUNDAY("Sunday")
    , MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDENSDAY("Wedensday"),
    THURSDAY("Tuesday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");
    String name;
    public String getName(){
        return name;
    }
 Days(String name){
    this.name=name;
}
}
