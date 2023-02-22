package assignment13;
public class Q5NumericDataInStringType {
    public static void main(String[] args) {
        // case 1: i<10
        /*
      int[] array = new int[10];
      int sum = 0;
      for(int i=0; i<10; i++){
            sum = sum + array[i];
      }
        System.out.println("sum is: "+sum);
       */
      //   case 2: i<11
        int array[] = {1,2,3,1,2,4,6,9,8,5};
        int sum = 0;
        //try{
            for(int i=0; i<11; i++){
                sum = sum + array[i];
            }
//        }
//        catch(Exception e){
//            System.out.println("The exception is: "+e);
//        }
//        finally {
//            System.out.println("Please check the number of values entered");
//        }
        System.out.println("The sum is: "+sum);
   }
}

/*
case 1:
sum is: 0
case 2:
--before handling
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at assignment13.Q5NumericDataInStringType.main(Q5NumericDataInStringType.java:18)

Process finished with exit code 1
--after handling
The exception is: java.lang.ArrayIndexOutOfBoundsException: 10
Please check the number of values entered
The sum is: 41

Process finished with exit code 0

 */