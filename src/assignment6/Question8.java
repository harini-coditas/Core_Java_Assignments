package assignment6;

class Pattern1A{
    public void print1A(){
        System.out.println("Pattern 1 is: ");
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
        System.out.println("Pattern 2 is: ");
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
        System.out.println("Pattern 3 is: ");
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
class Pattern2B{
    char charArray[] = {'A','B','C','D','E','F'};
    public void print2B(){
        System.out.println("Pattern 4 is: ");
        for(int i=0;i<charArray.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(charArray[j]+" ");
            }
            System.out.println();
        }
        for(int i=charArray.length-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(charArray[j]+" ");
            }
            System.out.println();
        }
    }
}
class Pattern3A{
    public void print3A(){
        System.out.println("Pattern 5 is: ");
       for(int i=0;i<5;i++){
          for(int k=5-i;k>0;k--){
              System.out.print(" ");
          }
          for(int j=0;j<2*i-1;j++){
              System.out.print("*");
          }
           System.out.println();
       }
        for(int i=5;i>=0;i--){
            for(int k=5-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern3B
{
       public void print3B() {
           System.out.println("Pattern 6 is: ");
           for (int i = 0; i <= 5; i++) {
               int alphabet = 65;
               for (int j = 0; j <= i; j++) {
                   System.out.print((char) (alphabet + j) + " ");
               }
               for (int k = i - 1; k >= 0; k--) {
                   System.out.print((char) (alphabet + k) + " ");
               }
               System.out.println();
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
        Pattern2B pattern4 = new Pattern2B();
        pattern4.print2B();
        Pattern3A pattern5 = new Pattern3A();
        pattern5.print3A();
        Pattern3B pattern6 = new Pattern3B();
        pattern6.print3B();
    }
}

/*
Output:

Pattern 1 is:
*
**
***
****
*****
Pattern 2 is:
A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F
Pattern 3 is:
*********
 *******
  *****
   ***
    *
Pattern 4 is:
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E
A B C D
A B C
A B
A
Pattern 5 is:

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

Pattern 6 is:
A
A B A
A B C B A
A B C D C B A
A B C D E D C B A
A B C D E F E D C B A

Process finished with exit code 0


 */