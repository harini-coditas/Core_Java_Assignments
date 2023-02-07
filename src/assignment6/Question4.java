package assignment6;

class ConvertSwitchtoIfElseIf{
   int m=1;
   int x=0;
   public void display(){
       if(m == 0){
           x = x + 2;
       }
       else if(m == 1){
           x = x + 4;
       }
       else if(m == 2){
           x = x + 6;
       }
       System.out.println("X = " +x);

   }
}
public class Question4 {
    public static void main(String[] args) {
        ConvertSwitchtoIfElseIf test= new ConvertSwitchtoIfElseIf();
        test.display();
    }
}
