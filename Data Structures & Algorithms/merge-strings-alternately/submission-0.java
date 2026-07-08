class Solution {
    public String mergeAlternately(String s, String check) {
         StringBuilder sb = new StringBuilder();

            int i = 0;
            while ( i <= s.length() -1 && i <= check.length()-1) {
                // System.out.println("First Step");
                sb.append(s.charAt(i));
                sb.append(check.charAt(i));
                i++;
                // System.out.println("the");
            }

            while (i <= s.length() -1) {
                sb.append(s.charAt(i));
                i++;
            }
            while (i <= check.length() -1) {
                sb.append(check.charAt(i));
                i++;
            }

            return sb.toString();
    }
}