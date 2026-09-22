void main() {
    runTask1();
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