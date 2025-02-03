package Ultra;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        String str = "jjjjgggtgtgsgdfjkss";

        // Step 1: Create a HashMap to store the frequency of characters
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Step 2: Traverse the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
        }

        // Step 3: Print out the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > 1) {  // If the frequency is more than 1, it's a duplicate
                System.out.println(c + ": " + charCount.get(c));
            }
        }
    }
}
