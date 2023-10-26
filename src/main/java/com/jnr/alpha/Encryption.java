package com.jnr.alpha;

import java.util.Map;

/**
 * @author native
 */

public class Encryption {
    public String run(String data, Map<Integer, Character> map) {
        StringBuilder encrypted = new StringBuilder();

        String reversed = new StringBuilder(data).reverse().toString();


        for (char c : reversed.toCharArray()) {
            if (Character.isLetter(c)) {
                int position = Character.toLowerCase(c) - 'a' + 1;
                if (position < 10) {
                    encrypted.append(Integer.toHexString(position).toUpperCase());
                } else encrypted.append(map.get(position));
            } else encrypted.append(c);
        }

        return encrypted.toString().trim();
    }
}
