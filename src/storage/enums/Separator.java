package storage.enums;

/**
 * @author decmoon
 */
public enum Separator {

    COMMA(",", ","),
    BLANK(" ", " ");

    private String separator;
    private String regex;

    Separator(String separator, String regex) {
        this.separator = separator;
        this.regex = regex;
    }

    public String getSeparator() {
        return separator;
    }

    public String getRegex() {
        return regex;
    }
}
