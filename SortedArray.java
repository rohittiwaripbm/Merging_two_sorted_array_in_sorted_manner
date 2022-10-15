import java.util.Arrays;

public class Check_array {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8};
        int[] arr1 = {0,2,4,6,9};
        int arr3_size = arr.length+arr1.length;
        int[] arr3 = new int[arr3_size];
        int j =0, k =0,i;
        for (i = 0; i < arr3_size; i++) {
            if(j<arr.length&k<arr1.length) {


                if ((arr[j] < arr1[k])) {
                    arr3[i] = arr[j];
                    j++;
                } else if ((arr[j] > arr1[k])) {
                    arr3[i] = arr1[k];
                    k++;
                }
            }
            else {
                break;
            }
        }
        while(k<=arr1.length-1)
        {
            arr3[i] = arr1[k];
            i++;
            k++;
        }
        while(j<=arr.length-1)
        {
            arr3[i] = arr[j];
            i++;
            j++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
