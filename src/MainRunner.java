void main() {
    runTask1();
    runTask2();
    runTask3();
    runTask4();
}

private static void runTask1() {
    IO.println("--- Task 1 ---");
    String validEmail = "automation_20240325_a1b2c3@solvd.com";
    String invalidEmail = "automation_test_email@solvd.com";
    IO.println("Input:  \"" + validEmail + "\"");
    IO.println("Output: " + Task1.isValidEmail(validEmail, "20240325"));
    IO.println("\nInput:  \"" + invalidEmail + "\"");
    IO.println("Output: " + Task1.isValidEmail(invalidEmail, "20240325"));
    IO.println("\n[Additional:] Check for strictly today's date:");
    IO.println("Input:  \"" + validEmail + "\"");
    IO.println("Output: " + Task1.isValidEmail(validEmail));
    IO.println();
}

private static void runTask2() {
    IO.println("--- Task 2 ---");
    String input = "Contact us at +1 (123) 456-7890 or 1-777-123-4567";
    List<String> numbers = Task2.extractPhoneNumbers(input);
    String formattedOutput = numbers.stream()
            .map(num -> "\"" + num + "\"")
            .collect(Collectors.joining(", "));
    IO.println("Input:  \"" + input + "\"");
    IO.println("Output: " + formattedOutput);
    IO.println();
}

private static void runTask3() {
    IO.println("--- Task 3 ---");
    String json = "{\"key1\": 11, \"key2\": 'asd', \"key3\": 342}";
    String keyToExtract = "key3";
    String extractedValue = Task3.extractJsonValue(json, keyToExtract);
    IO.println("Input JSON: " + json);
    IO.println("Key to extract: \"" + keyToExtract + "\"");
    IO.println("Output: " + extractedValue);
    IO.println();
}

private static void runTask4() {
    IO.println("--- Task 4 ---");
    String input = "ignore me [extract:me] ignore me!";
    String extractedValue = Task4.extractFromBrackets(input);
    IO.println("Input:  \"" + input + "\"");
    IO.println("Output: \"" + extractedValue + "\"");
    IO.println();
}