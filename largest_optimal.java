public class largest_optimal {
    public static void main (String args []){
        int arr [] = {2,5,1,0,3};
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is Empty");
        }
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
