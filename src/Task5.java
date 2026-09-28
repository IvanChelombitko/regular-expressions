public class Task5 {
    public static String groupRepeatingCharacters(String input) {
        if (input == null) {
            return null;
        }
        return input.toLowerCase().replaceAll("(.)\\1+", "$1");
    }
}