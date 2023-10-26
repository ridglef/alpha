package com.jnr.core;

import com.jnr.alpha.Decryption;
import com.jnr.alpha.Encryption;

/**
 * @author native
 */

public class Core {
    public static void main(String[] args) {
        Encryption alphaEnc = new Encryption();
        String encrypted = alphaEnc.run("native is the best and should win a nobel prize");
        String decrypted = Decryption.decrypt(encrypted);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
