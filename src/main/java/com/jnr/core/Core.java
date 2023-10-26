package com.jnr.core;

import com.jnr.alpha.Decryption;
import com.jnr.alpha.Encryption;
import com.jnr.util.CharMap;
import java.util.Map;

/**
 * @author native
 */

public class Core {
    public static void main(String[] args) {
        Encryption alphaEnc = new Encryption();
        Decryption alphaDec = new Decryption();
        Map<Integer, Character> map = CharMap.generateRandomCharMap();

        String encrypted = alphaEnc.run("native is the best and should win a nobel prize", CharMap.getDefaultCharMap());
        String decrypted = alphaDec.decrypt(encrypted, CharMap.getDefaultCharMap());

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);

        encrypted = alphaEnc.run("native is the best and should win a nobel prize", map);
        decrypted = alphaDec.decrypt(encrypted, map);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
