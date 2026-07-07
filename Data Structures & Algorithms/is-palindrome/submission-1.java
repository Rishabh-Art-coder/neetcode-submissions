class Solution {
    public static boolean isPalindrome(String s) {
    s = s.toLowerCase();
    int left = 0;
    int right = s.length() - 1;

    while (left <= right) {

      if (Character.isLetterOrDigit(s.charAt(left))) {
        if (Character.isLetterOrDigit(s.charAt(right))) {
          if (s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
          } else {
            System.out.println(s.charAt(left) + " , " + s.charAt(right));
            return false;
          }
        }else{
          right--;
        }
      } else {
        left++;
      }

    }
    return true;
  }
}
