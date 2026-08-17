import java.util.Arrays;

public class largest {
    public static void main (String args []){
        int arr [] = {2,5,1,3,0};
        // brute force approach
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
