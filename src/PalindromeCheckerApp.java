import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ======================
        // UC1: Welcome Message
        // ======================
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


        // ======================
        // UC3: String Reverse Using Loop
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


        // ======================
        // UC4: Character Array Based Check
        // ======================
        System.out.println("\nUC4: Character Array Based Palindrome Check");

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


        // ======================
        // UC5: Stack Based Check
        // ======================
        System.out.println("\nUC5: Stack Based Palindrome Check");

        String word3 = "madam";
        Stack<Character> stack = new Stack<>();

        for (char c : word3.toCharArray()) {
            stack.push(c);
        }

        boolean result = true;

        for (char c : word3.toCharArray()) {
            if (c != stack.pop()) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println(word3 + " is a Palindrome");
        } else {
            System.out.println(word3 + " is NOT a Palindrome");
        }

    }
}

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ======================
        // UC1: Welcome Message
        // ======================
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


        // ======================
        // UC3: String Reverse Using Loop
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


        // ======================
        // UC4: Character Array Based Check
        // ======================
        System.out.println("\nUC4: Character Array Based Palindrome Check");

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


        // ======================
        // UC5: Stack Based Check
        // ======================
        System.out.println("\nUC5: Stack Based Palindrome Check");

        String word3 = "madam";
        Stack<Character> stack = new Stack<>();

        for (char c : word3.toCharArray()) {
            stack.push(c);
        }

        boolean result = true;

        for (char c : word3.toCharArray()) {
            if (c != stack.pop()) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println(word3 + " is a Palindrome");
        } else {
            System.out.println(word3 + " is NOT a Palindrome");
        }


        // ======================
        // UC6: Queue + Stack Based Check
        // ======================
        System.out.println("\nUC6: Queue + Stack Based Palindrome Check");

        String word4 = "level";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        // Enqueue and Push
        for (char c : word4.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean finalResult = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack2.pop())) {
                finalResult = false;
                break;
            }
        }

        if (finalResult) {
            System.out.println(word4 + " is a Palindrome");
        } else {
            System.out.println(word4 + " is NOT a Palindrome");
        }

    }
}
