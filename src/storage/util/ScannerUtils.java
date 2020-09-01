package storage.util;

import java.util.Scanner;

/**
 * @author decmoon
 */
public class ScannerUtils {
    private ScannerUtils() {

    }

    public static Scanner getScanner() {
        return ScannerInner.scanner;
    }

    static class ScannerInner {
        private static final Scanner scanner = new Scanner(System.in);
    }

    public static String getLine() {
        return getScanner().nextLine();
    }

    public static String getString() {
        return getLine();
    }

    public static Integer getInteger() throws NumberFormatException {
        return Integer.valueOf(getString());
    }
}
