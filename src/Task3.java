import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static String extractJsonValue(String json, String keyToExtract) {
        String regex = "\"" + keyToExtract + "\"\\s*:\\s*['\"]?(.*?)['\"]?\\s*[,}]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(json);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}