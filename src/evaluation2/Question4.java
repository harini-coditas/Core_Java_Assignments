package evaluation2;

class Pattern{
    public void pattern(){
        for( int i = 0 ; i < 4 ; i++){
            for(int j = 4-i ; j >= 0 ; j--){
                System.out.print(" ");
            }
            for(int k = 0 ; k <= i ; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
public class Question4 {
    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.pattern();
    }
}

/*
     *
    * *
   * * *
  * * * *

Process finished with exit code 0

 */