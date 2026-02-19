public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("📘 PALINDROME CHECKER APP");
        System.out.println("Version 1.0");
        System.out.println("UC1: Application Entry & Welcome Message");

        // ======================
        // UC2: Hardcoded Palindrome Check
        // ======================

        System.out.println("\nUC2: Hardcoded Palindrome Check");

        String word = "madam";

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

    }
}
