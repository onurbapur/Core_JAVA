package Day30_WrapperClasses_2;

import java.util.Arrays;

public class MaxValue {
    public static int maxValue(int[] arr){
      // int max = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
          //max = Integer.max(max,arr[i]);
          //max = Math.max(max,arr[i]);
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int minValue(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int eleman : arr) {
            if(eleman < min){
                min = eleman;
            }
        }
        return min;
    }
    public static int[] minAndMaxValue(int[] arr){
        int[] result = new int[2];
        result[0] = minValue(arr);
        result[1] = maxValue(arr);
        return result;
    }

    public static void main(String[] args) {
        int[] sayilar = {3,5,1,-100,-30,23};
        int[] numbers = {23,45,67,89,1};
       // int maximum = maxValue(sayilar);

        System.out.println("maxValue(sayilar) = " + maxValue(sayilar));
        System.out.println("minValue(sayilar) = " + minValue(sayilar));
        System.out.println("minValue(numbers) = " + minValue(numbers));

        System.out.println("minAndMaxValue(sayilar) = " + Arrays.toString(minAndMaxValue(sayilar)));

        for (int eleman: minAndMaxValue(sayilar)) {
            System.out.println(eleman);
        }
        int[] abc = minAndMaxValue(sayilar);
        System.out.println("MinValue = " + abc[0]);
        System.out.println("MaxValue = " + abc[1]);

    }
}
