package JavaProject2;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoneRepeating {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");

    }
}