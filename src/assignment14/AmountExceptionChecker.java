package assignment14;

public class AmountExceptionChecker {
    int balance = 13000;
    public void deposit(int depositAmount){
        try{
            if(depositAmount <= 0){
                throw new InvalidAmountException(" deposit is INVALID");
            }
        }
        catch(InvalidAmountException e){

        }
    }
    public void withdrawal(int withdrawalAmount){
        try{
            if(withdrawalAmount <= 0 ){
                throw new InvalidAmountException(" withdrawal is INVALID");
            }
            try{
                if(withdrawalAmount > balance){
                    throw new InsufficientBalanceException(" is greater than balance");
                }
            }
            catch(InsufficientBalanceException e){

            }
        }
        catch(InvalidAmountException e){

        }
    }
}
