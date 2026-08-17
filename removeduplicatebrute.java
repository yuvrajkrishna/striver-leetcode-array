public class removeduplicatebrute {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3, 3};

        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            // Check whether arr[i] already appeared
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}