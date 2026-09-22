import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Task1 {
    public static boolean isValidEmail(String email) {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return validate(email, currentDate);
    }

    public static boolean isValidEmail(String email, String date) {
        return validate(email, date);
    }

    private static boolean validate(String email, String dateString) {
        String regex = "^automation_" + dateString + "_[a-zA-Z0-9]{6}@solvd\\.com$";
        return Pattern.matches(regex, email);
    }
}