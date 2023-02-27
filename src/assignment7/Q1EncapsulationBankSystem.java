package assignment7;

class BankSystemLogin{
    private String userFirstName;
    private String userLastName;
    private String userAddress;
    private int userAge;
    private int userAccountNo;

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserAccountNo() {
        return userAccountNo;
    }

    public void setUserAccountNo(int userAccountNo) {
        this.userAccountNo = userAccountNo;
    }

    @Override
    public String toString() {
        return "BankSystemLogin{" +
                "userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userAge=" + userAge +
                ", userAccountNo=" + userAccountNo +
                '}';
    }
}
class BankEmployee{
    private int employeeId;
    private String employeeName;
    private int emlpoyeeAge;
    private int employeeSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmlpoyeeAge() {
        return emlpoyeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.emlpoyeeAge = emlpoyeeAge;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "BankEmployee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", emlpoyeeAge=" + emlpoyeeAge +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
class Transaction{
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int credit(int creditAmount){
        amount = amount+creditAmount;
        return amount;
    }
    public int debit(int debitAmount){
        amount = amount-debitAmount;
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                '}';
    }
}
public class Q1EncapsulationBankSystem {
    public static void main(String[] args) {
       BankSystemLogin login = new BankSystemLogin();
       login.setUserFirstName("Harini");
       login.setUserLastName("Bathini");
       login.setUserAccountNo(1233445);
       login.setUserAge(22);
       login.setUserAddress("Pune");
        System.out.println(login.toString());

       BankEmployee employee = new BankEmployee();
       employee.setEmployeeId(1);
       employee.setEmployeeName("Raj");
       employee.setEmployeeAge(32);
       employee.setEmployeeSalary(50000);
       System.out.println(employee.toString());

       Transaction transaction = new Transaction();
       transaction.setAmount(30000);
        System.out.println(transaction.toString());
        System.out.println("Amount after credit: "+transaction.credit(15000));
        System.out.println("Amount after debit: "+transaction.debit(10000));
    }
}

/*
BankSystemLogin{userFirstName='Harini', userLastName='Bathini', userAddress='Pune', userAge=22, userAccountNo=1233445}
BankEmployee{employeeId=1, employeeName='Raj', emlpoyeeAge=0, employeeSalary=50000}
Transaction{amount=30000}
Amount after credit: 45000
Amount after debit: 35000
 */