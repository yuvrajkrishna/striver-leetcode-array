public class two {
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 7, 7, 5};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        if(nums == null || nums.length < 2){
            throw new IllegalArgumentException("array doesn't contains required elements");
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                secmax = max;
                max = nums[i];
            }
            else if (nums[i] > secmax && nums[i] != max){
                secmax = nums[i];
            } 
        }
        if(secmax == Integer.MIN_VALUE){
            throw new IllegalArgumentException("second max doesn't exist");
        }
        System.out.println(secmax);
    }
}
