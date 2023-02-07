package assignment6;

import java.util.*;
class Operations1{
    String weekdays[] = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" ,"Friday" , "Saturday" , "Sunday"};
    public void printData(){
        System.out.println("--Output of printData method--");
        System.out.println("The days in a week are: ");
        for( int i = 0 ; i < weekdays.length ; i++ ){
            if(weekdays[i] == "Thursday"){
                continue;
            }
            System.out.println(weekdays[i]);

        }
        /*
        for ( String day :  weekdays) {
            System.out.println(day);
        }
        */

    }
}
class Operations2{
    public void skipToday(){
        System.out.println("--Output of skipToday method--");
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        String weekdays[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for(int i=0 ; i < weekdays.length ; i++) {
            if (i == (day - 1))
                continue;
            System.out.println(weekdays[i]);
        }
    }

}
class Operations3{
        public void printDateTillToday(){
            System.out.println("--Output of printDateTillToday method--");
            Date date = new Date();
            int todayDate = date.getDate();
            for(int i = 1 ; i <= 28 ; i++){
                if(todayDate+1 == i)
                    break;
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }


public class Question7 {
    public static void main(String[] args) {
        Operations1 test1 = new Operations1();
        test1.printData();
        Operations2 test2 = new Operations2();
        test2.skipToday();
        Operations3 test3 = new Operations3();
        test3.printDateTillToday();

    }
}
