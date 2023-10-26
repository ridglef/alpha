package com.jnr.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author native
 */

public class CharMap {

    @SuppressWarnings({"all"})
    public static Map<Integer, Character> getCharMap() {
        Map<Integer, Character> map = new HashMap<>();
        map.put(10, '\u03A9');
        map.put(11, '\u03AF');
        map.put(12, '\u03AB');
        map.put(13, '\u03AC');
        map.put(14, '\u04AF');
        map.put(15, '\u03AE');
        map.put(16, '\u03AA');
        map.put(17, '\u03FA');
        map.put(18, '\u03FF');
        map.put(19, '\u03EE');
        map.put(20, '\u07A4');
        map.put(21, '\u08AC');
        map.put(22, '\u08AB');
        map.put(23, '\u08AF');
        map.put(24, '\u02AF');
        map.put(25, '\u00EE');
        map.put(26, '\u00AA');
        return map;
    }
}
