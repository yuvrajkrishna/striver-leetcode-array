import java.util.Arrays;

public class leftrotatebyone{
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int temp [] = new int [arr.length];
        for(int i = 1;  i < arr.length ; i++){
            temp[i-1] = arr[i];
        }
        temp[arr.length-1] = arr[0];
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }
}