package evaluation3;

import java.util.*;
class Vehicle{
    String company;
    int price;

    Vehicle(){
        System.out.println("this is default Constructor");
    }
    Vehicle(String company,int price){
        this.company=company;
        this.price=price;

    }
    public void display(){

        System.out.println("Company is : "+company+" price of vehicle is : "+price);
    }

}
class LightMotorVehicle extends Vehicle{
    int mileage;
    LightMotorVehicle(String company,int price,int mileage){
        this.company=company;
        this.price=price;
        this.mileage = mileage;
    }
    public void display(int mileage){
       this.mileage = mileage;
        System.out.println("LightMotorVehicle details: ");
        super.display();
        System.out.println("Mileage is :" +mileage);
    }
}
class HeavyMotorVehicle extends Vehicle{
     int capacityInTons;
    HeavyMotorVehicle(String company,int price,int capacityInTons){
        this.company=company;
        this.price=price;
        this.capacityInTons = capacityInTons;
    }
     public void display(int capacityInTons){
         this.capacityInTons = capacityInTons;

         System.out.println("HeavyMotorVehicle details: ");
         super.display();
         System.out.println( "capacityInTons : "+capacityInTons);
     }
}
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("---Enter the required type of Vehicle---");
            String type = sc.next();
            if (type.equals("LightMotorVehicle")) {
                LightMotorVehicle motorLight = new LightMotorVehicle("Tvs", 30000, 10);
                motorLight.display();
            }
            if (type.equals("HeavyMotorVehicle")) {
                HeavyMotorVehicle motorHeavy = new HeavyMotorVehicle("Suzuki", 600000, 300);
                motorHeavy.display();
            }


        }
    }
}

/*
Output--
---Enter the required type of Vehicle---
HeavyMotorVehicle
this is default Constructor
Company is : Suzuki price of vehicle is : 600000

---Enter the required type of Vehicle---
LightMotorVehicle
this is default Constructor
Company is : Tvs price of vehicle is : 30000

---Enter the required type of Vehicle---
LightMotorVehicle
this is default Constructor
Company is : Tvs price of vehicle is : 30000
Enter the required type of Vehicle
 */