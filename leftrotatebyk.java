import java.util.Arrays;

public class leftrotatebyk {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};

        int k = 2;

        k = k % arr.length;

        int temp[] = new int[k];

        // Store first k elements
        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }

        // Shift remaining elements to left
        for(int i = k; i < arr.length; i++){
            arr[i-k] = arr[i];
        }

        // Put temp elements at the end
        for(int i = arr.length-k; i < arr.length; i++){
            arr[i] = temp[i - (arr.length-k)];
        }

        System.out.println(Arrays.toString(arr));
    }
}