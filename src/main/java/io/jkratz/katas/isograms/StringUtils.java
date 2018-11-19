package io.jkratz.katas.isograms;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {

    public static boolean isIsogram(String str) {
        Map<Character, Integer> chars = new HashMap<>();
        String loweredString = str.toLowerCase();
        for (char c: loweredString.toCharArray()) {
            if (chars.containsKey(c)) {
                return false;
            } else {
                chars.put(c, 1);
            }
        }
        return true;
    }
}
