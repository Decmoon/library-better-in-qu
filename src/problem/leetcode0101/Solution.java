package problem.leetcode0101;

public class Solution {


    public boolean isUnique(String string) {
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (string.indexOf(c) != string.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }

}
