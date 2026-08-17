public class checkifarrayissorted {
    public static void main(String[] args) {
        int arr [] = {1,2,3,3,5};
        for(int i = 0 ; i < arr.length-1; i++){
            for(int j = i+1; j <arr.length;j++){
                if(arr[i]>arr[j]){
                    System.out.println("Not Sorted");
                    return;
                }
            }
        }
        System.out.println("Sorted");
    }
}
