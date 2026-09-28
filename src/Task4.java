import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static String extractFromBrackets(String input) {
        String regex = "\\[(.*?)]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}