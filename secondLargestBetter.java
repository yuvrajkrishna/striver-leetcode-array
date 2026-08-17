public class secondLargestBetter {
    public static void main(String[] args) {
        int arr [] = {1, 2, 4, 7, 7, 5};
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length  ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int secmax = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > secmax && arr[i] !=max){
                secmax = arr[i];
            }
        }
        System.out.println(secmax);
    }
}
