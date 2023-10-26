package com.jnr.alpha;

import java.util.Map;

/**
 * @author native
 */

public class Decryption {
    public String decrypt(String data,  Map<Integer, Character> map) {
        StringBuilder root = new StringBuilder(data);
        root.reverse();

        for (char c : root.toString().toCharArray()) {
            int index = root.indexOf(String.valueOf(c));
            if (Character.isDigit(c)) {
                int de_hex = Integer.parseInt(String.valueOf(c));
                char decrypted_char = (char) (de_hex - 1 + 'a');

                root.replace(index, index + 1, String.valueOf(decrypted_char));
            } else {

                map.values().forEach(val -> {
                    if (c == val) {
                        int decrypted_key = 0;
                        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
                            if (entry.getValue() == val) {
                                decrypted_key = entry.getKey();
                                break;
                            }
                        }
                        char decrypted_char = (char) (decrypted_key - 1 + 'a');
                        root.replace(index, index + 1, String.valueOf(decrypted_char));
                    }
                });
            }
        }

        return root.toString();
    }
}
