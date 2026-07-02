class Solution {
    public void rotate(int[] nums, int k) {
        
        if(nums == null || nums.length <= 1){
            return ;
        }

        k = k% nums.length;

        
        reverse(nums , 0 , nums.length -1);
        reverse(nums , 0 , k -1);
        reverse(nums , k , nums.length -1);
        
        
    }

    public static void reverse(int arr[] , int start , int end){
        while(start < end){
            int swap = arr[end];
            arr[end] = arr[start];
            arr[start] = swap;
            start++;
            end--;
        }
    }
}