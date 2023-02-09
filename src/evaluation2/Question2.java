package evaluation2;

import java.time.LocalDate;
import java.util.*;
import java.time.DayOfWeek;

class WeekDays{

    String days[] = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
    public void display(String inputDay){
       switch(inputDay){
            case "MONDAY":
                System.out.println("Its a start of week");
                break;
            case "TUESDAY":
               System.out.println("Its a second day of week");
               break;
            case "WEDNESDAY":
               System.out.println("Its a third day of week");
               break;
            case "THURSDAY":
                System.out.println("Its a fourth day of week");
                break;
            case "FRIDAY":
               System.out.println("Its a start day of week....enjoy your weekend");
               break;
            case "SATURDAY":
               System.out.println("Its a Weekend!!!majjani life :");
               break;
            case "Sunday":
               System.out.println("Last day of weekend :(");
               break;
               default:
                   System.out.println("Enter the valid date");

        }
    }
    public void notToday(){
        /*for(int index : days){
            if(days[index]==dow){

            }*/


    }

}
public class Question2 {
    public static void main(String[] args) {
        WeekDays days = new WeekDays();

        LocalDate currentDate = LocalDate.now();

       DayOfWeek dow = currentDate.getDayOfWeek();
        days.display(String.valueOf(dow));
    }
}

/*
Output1:
Its a fourth day of week

Process finished with exit code 0

 */