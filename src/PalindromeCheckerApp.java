public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("📘 PALINDROME CHECKER APP");
        System.out.println("Version 1.0");

        // ======================
        // UC2
        // ======================
        System.out.println("\nUC2: Hardcoded Palindrome Check");

        String word = "madam";

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        // ======================
        // UC3
        // ======================
        System.out.println("\nUC3: Palindrome using String Reverse");

        String original = "level";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }




        // UC4: Character Array Two Pointer
        System.out.println("\nUC4: Character Array Check");

        String word2 = "radar";
        char[] arr = word2.toCharArray();

        boolean isPalindrome = true;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word2 + " is a Palindrome");
        } else {
            System.out.println(word2 + " is NOT a Palindrome");
        }

    }   // ← main ends here

}   // ← class ends here
