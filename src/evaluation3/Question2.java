package evaluation3;

import java.util.*;
abstract class Order{
    public int id;
    String description;
    Order() {
        System.out.println("Default parent Constructor");
    }
    Order(int id,String description) {
        this.id=id;
        this.description=description;
    }
    abstract void accept();
    abstract void display();

}

class PurchaseOrder extends Order{
    String customerName;
    PurchaseOrder(int id,String description,String CustomerName) {
        this.id=id;
        this.description=description;
        this.customerName=customerName;
    }


    @Override
    void accept() {
        System.out.println("accept the Purchase order details");
    }

    void display(){

        System.out.println("PurchaseOrder{" +
                "customerName='" + customerName + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}');
        System.out.println("--------------");
    }

}
class SalesOrder extends Order{
    String vendorName;
    SalesOrder(int id,String description,String vendorName) {
        this.id=id;
        this.description=description;
        this.vendorName=vendorName;
    }

    @Override
    void accept() {
        System.out.println("accept the sales order details");
    }

    void display(){

        System.out.println("SalesOrder{" +
                "vendorName='" + vendorName + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}');
        System.out.println("--------------");
    }

}

public class Question2 {
    public static void main(String[] args) {
       PurchaseOrder purchaseOrder;
        purchaseOrder = new PurchaseOrder(1,"Shoe","Ram");
        purchaseOrder.display();
        SalesOrder salesOrder = new SalesOrder(1,"Chocolate","Raghav") ;
        salesOrder.display();

    }

    }

/*
Output--

Default parent Constructor
PurchaseOrder{customerName='null', id=1, description='Shoe'}
--------------
Default parent Constructor
SalesOrder{vendorName='Raghav', id=1, description='Chocolate'}
--------------

Process finished with exit code 0

 */