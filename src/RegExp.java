import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // TODO fill in code here for extracting IP address using Regular Expression
        // Splitting the pattern into 3 subgroups to match corner cases:
        //      '(1?\d{1,2})' = 00-199  - general case for all numbers up to 199
        //      '(2[0-4]\d)'  = 200-249 - case for numbers starts from 200
        //      '(25[0-5])'   = 250-255 - corner case for end of valid range up to 255
        //  combine those 3 subgroups with OR to match either valid range for 1st part:
        //      '(..)|(..)|(..)'
        //  then repeat the same pattern for rest 3 numbers separated with leading '.':
        //      '..(\.(..)){3}'
        String pattern = "(((25[0-5])|(2[0-4]\\d)|(1?\\d{1,2}))" +
                      "(\\.((25[0-5])|(2[0-4]\\d)|(1?\\d{1,2}))){3})";

        Matcher matcher = Pattern.compile(pattern).matcher(text);
        if (matcher.find() ){
            return matcher.group();
        }
        return "";
    }
}