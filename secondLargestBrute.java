import java.util.Arrays;
public class secondLargestBrute {
    public static void main(String[] args) {
        int arr [] = {1, 2, 4, 7, 7, 5};
        if(arr==null || arr.length < 1){
            throw new IllegalArgumentException("Array doesn't contain required elem");
        }
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int secmax = Integer.MIN_VALUE;
        for(int i = arr.length-2; i >= 0 ; i--){
            if(arr[i] != max){
                secmax = arr[i];
                break;
            }
        }
        if(secmax == Integer.MIN_VALUE){
            throw new IllegalArgumentException("Array doesn't contain the second largest Element");
        }
        System.out.println(secmax);
    }
}
