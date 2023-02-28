package assignment9;

class Medicine {
    String name;
    MedicineCompanyAddress address;
    public void displayLabel(String name,MedicineCompanyAddress address){
        this.name = name;
        this.address = address;
        System.out.println("Name of Medicine is: "+name);
        System.out.println("Company Address is: "+address);
    }
}
class Tablet extends Medicine{
    @Override
    public void displayLabel(String name, MedicineCompanyAddress address) {
        super.displayLabel(name, address);
        System.out.println("store in a cool dry place");
    }
}
class Syrup extends Medicine{
    @Override
    public void displayLabel(String name, MedicineCompanyAddress address) {
        super.displayLabel(name, address);
        System.out.println("store away from sunlight and at room temperature");
    }
}
class Ointment extends Medicine{
    @Override
    public void displayLabel(String name, MedicineCompanyAddress address) {
        super.displayLabel(name, address);
        System.out.println("for external use only");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Medicine medicine = new Medicine();
//      for(int i =0;i<10;i++){
//          //HAVE TO DO
//      }
    }
}
