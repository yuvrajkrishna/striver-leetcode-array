public class two {
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 7, 7, 5};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                secmax = max;
                max = nums[i];
            }
            else if (nums[i] > secmax && nums[i] != max){
                secmax = nums[i];
            } 
        }
        System.out.println(secmax);
    }
}
