import java.util.Arrays;

public class leftrotatebyonebrute {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        for (int k = 0; k < 1; k++) {

            int temp = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            arr[arr.length - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}