public class three {
    public static void main(String[] args) {
        int nums [] = {1,1,8,4,5};
        for(int i = 0 ; i < nums.length-1; i++){
            int j = i+1;
            if(nums[i] > nums[j]){
                System.out.println("not");
                return;
            }
        }
        System.out.println("sorted");
    }
}
