package assignment7;

class JaggedArray{
    int array1[][] = {{1,2},{3,4,5,5},{6,8,7}};
    int array2[][] = {{7,8},{5,1,2,4},{1,1,3}};
    public void addJaggedArrays(){
        int result;
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                    result = array1[i][j] + array2[i][j];
                    System.out.println("Addition result of two jagged arrays is: " + result);

            }
        }

    }
}
public class Question5 {
    public static void main(String[] args) {
        JaggedArray array = new JaggedArray();
        array.addJaggedArrays();
    }
}

/*
Output:
Addition result of two jagged arrays is: 8
Addition result of two jagged arrays is: 10
Addition result of two jagged arrays is: 8
Addition result of two jagged arrays is: 5
Addition result of two jagged arrays is: 7
Addition result of two jagged arrays is: 9
Addition result of two jagged arrays is: 7
Addition result of two jagged arrays is: 9
Addition result of two jagged arrays is: 10

Process finished with exit code 0

 */
