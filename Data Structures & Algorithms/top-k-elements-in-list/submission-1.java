class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap <Integer ,Integer> map = new HashMap<>();

            int[] arr = new int[k];
            int j = 0;
         for(int i = 0; i < nums.length ; i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.getOrDefault(nums[i] ,0) +1);
            }else{
                map.put(nums[i] , 1);
            }
            
        
         }

         List<Integer> ls = new ArrayList<>(map.keySet());
         ls.sort((a,b) -> map.get(b) - map.get(a));
         
         for (int i = 0; i < k  ;i++ ){
             arr[i] = ls.get(i);
         }

         return arr;
    }
}
