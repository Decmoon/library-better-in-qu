package problem.leetcode0101;

public class Solution {

    public boolean isUnique(String string) {
        char[] chars = string.toCharArray();

        //单字符
        if (chars.length == 1) {
            return true;
        }

        for (int i = 0; i < chars.length; i++) {
            String[] split = string.split(chars[i] + "");
            int size = split.length;
            if (size == 0 || size > 2) {
                return false;
            }
        }
        return true;
    }

}
