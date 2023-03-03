package cafeallocationsystem;
import java.util.Random;
public class PlaceOrder extends PrintMenu{
   // @Override
//    public void displayMenu() {
//        super.displayMenu();
//    }
 boolean allowed;
    @Override
    public boolean hasReservation(boolean hasTable) {
        super.hasReservation(hasTable);
        //allowed = this.hasTable;

        return hasTable;
    }

    public void inputDetails() {
        try {
            if (hasTable == true) {
                System.out.println("Please enter your Table number");
                int tableNo = sc.nextInt();
                System.out.println("Please enter your choice as 'yes' to order and 'no' to exit");
                sc.nextLine();
                String choice = sc.nextLine();
                switch (choice) {
                    case "yes":
                        displayMenu();
                        yourOrder();
                        break;
                    case "no":
                        //flag1 = false;
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Please enter the valid choice");
                        break;
                }
            } else {
                throw new NoReservationFound();
            }
        } catch (NoReservationFound e) {
           // System.exit(0);
        }
    }
            public void yourOrder(){
                int totalBill = 0;
                boolean hasCoffee = false;
                int count = 0;
                Random random = new Random();
                System.out.println("Enter the number of items you want to order");
                int countOfOrders = sc.nextInt();
                int ordered[] = new int[countOfOrders];
                int quantityOrdered[] = new int[countOfOrders];
                for (int i = 0; i < countOfOrders; i++) {
                    System.out.println("Please enter the serialNo of your order as in the menu");
                    int order = sc.nextInt();
                    if (order < 0 || order >= serialNo.length) {
                        System.out.println("Invalid choice entered. Please select from the above menu");
                        i--;
                        continue;
                    } else {
                        ordered[i] = order;
                    }

                    System.out.println("Please enter the required quantity of your order");
                    int quantity = sc.nextInt();
                    quantityOrdered[i] = quantity;
                }
                for (int i = 0; i < quantityOrdered.length; i++) {
                    System.out.println("itemOrdered: " + menu[ordered[i]] + " | " + "  quantityOrdered: " + quantityOrdered[i] + "   |   " + "totalCost: " + price[ordered[i]] * quantityOrdered[i]);
                    totalBill += price[ordered[i]] * quantityOrdered[i];

                }
                for (int j = 0; j < ordered.length; j++) {
                    if (ordered[j] == serialNo[0])
                        hasCoffee = true;
                }
                if (!hasCoffee) {
                    try {
                        throw new InValidOrderException();
                    } catch (InValidOrderException e) {
                        System.exit(0);
                    }

                }
                //if(count==0) {
                int orderNumber = random.nextInt(1000);
                System.out.println("---   Order number of your order is: " + orderNumber + "   --- ");
                System.out.println("----- Total bill to be paid for this order number-" + orderNumber + " is: " + totalBill + " ----- ");
                // }
            }
//          public static void main(String[] args) {
//          PlaceOrder placeOrder = new PlaceOrder();
//              System.out.println(placeOrder.hasReservation(hasTable));
//          placeOrder.inputDetails();
//
//          }
}
        //}
//    }catch(NoReservationFound e){
//        System.exit(0);
//    }

