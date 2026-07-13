class Solution {
    public List<Integer> majorityElement(int[] nums) {

    HashMap<Integer, Integer> set = new HashMap<>();
    List<Integer> ls = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      set.put(nums[i], set.getOrDefault(nums[i], 0) + 1);
    }
    int n = nums.length;
    for (Map.Entry<Integer, Integer> entry : set.entrySet()) {
      int element = entry.getKey(); 
      int count = entry.getValue();

    
      if (count > (n / 3)) {
        ls.add(element);
      }
    }

      return ls ;

    }
}