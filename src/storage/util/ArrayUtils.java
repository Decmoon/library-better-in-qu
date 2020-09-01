package storage.util;

import storage.enums.Separator;

/**
 * @author decmoon
 */
public class ArrayUtils {


    private ArrayUtils() {
    }


    public static int[] toIntArray(Separator separator, String string) throws NumberFormatException {
        String[] split = string.split(separator.getRegex());
        int[] arr = new int[split.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(split[i]);
        }
        return arr;
    }

    public static String[] toStringArray(Separator separator, String string) {
        return string.split(separator.getRegex());
    }


}
