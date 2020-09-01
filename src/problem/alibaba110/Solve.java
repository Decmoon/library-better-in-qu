package problem.alibaba110;

import storage.util.ArrayUtils;
import storage.util.ScannerUtils;
import storage.enums.Separator;

/**
 * @author decmoon
 */
public class Solve {

    private static int size;
    private static int offset;
    private static int[] array;


    private static void scannerIn() {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    size = ScannerUtils.getInteger();
                    break;
                case 1:
                    offset = ScannerUtils.getInteger();
                    break;
                case 2:
                    array = ArrayUtils.toIntArray(Separator.COMMA, ScannerUtils.getLine());
                    break;
                default:
                    break;
            }
        }
    }


    public static void main(String[] args) {
        scannerIn();
        // -------- to be continue
    }

}
