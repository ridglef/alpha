package com.jnr.alpha;

import com.jnr.util.CharMap;

import java.util.Map;

/**
 * @author native
 */

public class Encryption {
    public String run(String data) {
        StringBuilder encrypted = new StringBuilder();

        String reversed = new StringBuilder(data).reverse().toString();

        Map<Integer, Character> map = CharMap.getCharMap();

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
