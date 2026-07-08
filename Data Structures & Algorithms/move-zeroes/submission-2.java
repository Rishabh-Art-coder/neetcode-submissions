class Solution {
    public void moveZeroes(int[] nums) {
         int low = 0;
        int high = nums.length - 1;

        int j = low +1 ;
        while (low <= high && j < nums.length) {

            if (nums[low] == 0) {
               
                    if (nums[j] != 0) {
                   

                    int temp = nums[low];
                    nums[low] = nums[j];
                    nums[j] = temp;
                    low++;
                    j= low +1;
                        }else{
                    j++;
                    }
            }else{
                low++;
                j = low +1;
            }
        }

    }
}