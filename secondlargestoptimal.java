public class secondlargestoptimal {
    public static void main(String[] args) {
        int arr [] = {1, 2, 4, 7, 7, 5};
        if(arr== null || arr.length == 0){
            throw new IllegalArgumentException("Array is Empty");
        }
        int max = arr[0];
        int secmax = Integer.MIN_VALUE;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }
            else if(arr[i] > secmax && arr[i] != max){
                secmax = arr[i];
            }
        }
        if (secmax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element");
        }
        System.out.println(secmax);
    }
}
