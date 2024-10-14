import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] arr = {500, 200, 1, 4, 5, 90, 100, 30000, 23, 45, 67, 29, 12, 10, 2, 14};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }
}

// reverseArray(arr);
          //  System.out.print(" "+number[i]);
      //  }
        //}
   // public static void main(String[]arg){
      //  reverseArray(arr);
       // System.out.println(Arrays.toString(arr));






