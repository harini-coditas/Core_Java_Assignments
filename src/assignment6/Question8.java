package assignment6;

class Pattern1A{
    public void print1A(){
        for( int i=0 ; i < 5 ; i++){
            for(int j=0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern1B{
    public void print1B(){
        char charArray[] = {'A','B','C','D','E','F'};

        for( int i=5 ; i >= 0 ; i--){
            for(int j=0 ; j <= i ; j++){
                System.out.print(charArray[j]+" ");
            }
            System.out.println();
        }
        for( int i=0 ; i < 6 ; i++){
            for(int j=0 ; j <= i ; j++){
                System.out.print(charArray[j]+" ");
            }
            System.out.println();
        }
    }
}
class Pattern2A{
    public void print2A(){
        for( int i=9 ; i >= 1 ; i--) {

            for(int k1=1 ; k1<=9-i ; k1++) {
                System.out.print(" ");
                k1++;
            }

            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            i = i - 1;
        }
    }
}
public class Question8 {
    public static void main(String[] args) {
        Pattern1A pattern1 = new Pattern1A();
        pattern1.print1A();
        Pattern1B pattern2 = new Pattern1B();
        pattern2.print1B();
        Pattern2A pattern3 = new Pattern2A();
        pattern3.print2A();
    }
}

/*
Output:

 */