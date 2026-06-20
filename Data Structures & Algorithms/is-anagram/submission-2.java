class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap <Character , Integer> map = new HashMap<>();

            int i = 0;
          while(i < s.length()){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
               if(map.containsKey(ch)){
                map.put(ch , map.getOrDefault(ch , 0) + 1);
            }else{
                map.put(ch , 1);
            }
            }else{
                map.put(ch , 1);
            }

            i++;
          }
        
        int j = 0;
          while(j < t.length()){
            char ch = t.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch , map.getOrDefault(ch , 0) - 1);
            }else{
                map.put(ch , 1);
            }

            j++;
          }

          for(Integer k : map.values()){
             if(k == 1 || k > 1){
                return false;
             }
          }

          return true;
    }
}
