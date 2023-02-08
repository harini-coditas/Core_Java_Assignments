package assignment6;

import java.util.*;
class YoungestAndOldest{
    Scanner sc = new Scanner(System.in);
    int ageOfPerson1 = sc.nextInt();
    int ageOfPerson2 = sc.nextInt();
    int ageOfPerson3 = sc.nextInt();
    public void showYoungAndOld(){
        if((ageOfPerson1 > ageOfPerson2) && (ageOfPerson1 > ageOfPerson3)){
            if(ageOfPerson2 > ageOfPerson3){
                System.out.println(" The Youngest is Person 3: " +ageOfPerson3);
            }
            else{
                System.out.println(" The Youngest is Person 2: " +ageOfPerson2);
            }
            System.out.println(" The Oldest is Person 1: " +ageOfPerson1);
        }
        if((ageOfPerson2 > ageOfPerson1) && (ageOfPerson2 > ageOfPerson3)){
            if(ageOfPerson1 > ageOfPerson3){
                System.out.println(" The Youngest is Person 3: " +ageOfPerson3);
            }
            else{
                System.out.println(" The Youngest is Person 1: " +ageOfPerson1);
            }
            System.out.println(" The Oldest is Person 2: " +ageOfPerson2);
        }
        if((ageOfPerson3 > ageOfPerson1) && (ageOfPerson3 > ageOfPerson2)){
            if(ageOfPerson1 > ageOfPerson2){
                System.out.println(" The Youngest is Person 2: " +ageOfPerson2);
            }
            else{
                System.out.println(" The Youngest is Person 1: " +ageOfPerson1);
            }
            System.out.println(" The Oldest is Person 3: " +ageOfPerson3);
        }
    }
}
public class Question6 {
    public static void main(String[] args) {
        YoungestAndOldest test = new YoungestAndOldest();
        test.showYoungAndOld();
    }
}

/*
Output:
56
78
13
 The Youngest is Person 3: 13
 The Oldest is Person 2: 78

Process finished with exit code 0
 */
