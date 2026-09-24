import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static List<String> extractPhoneNumbers(String text) {
        List<String> extractedNumbers = new ArrayList<>();
        String regex = "\\+?(?:\\d[\\s-]?){0,3}(?:\\(\\d{3}\\)|\\d{3})[\\s-]?\\d{3}[\\s-]?\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String rawMatch = matcher.group();
            String cleanNumber = rawMatch.replaceAll("\\D", "");
            extractedNumbers.add(cleanNumber);
        }
        return extractedNumbers;
    }
}