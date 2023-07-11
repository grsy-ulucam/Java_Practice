package lessons;

import java.util.Arrays;

public class j23_Exceptions {

    public static void main(String[] args) {

        int arr []={12,22,33,44};

       try {
           System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
           System.out.println(arr[5]);

       }catch (ArrayIndexOutOfBoundsException array){
           System.out.println("array.getMessage() = " + array.getMessage());
       }
      finally {
           System.out.println("your code was run ");}

    }
}
