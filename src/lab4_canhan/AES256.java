/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_canhan;

import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

public class AES256 {

    final static String password = "123";
    final static String salt = "9f9506b0572f21ec";

    public static String encrypt(String textToEncrypt) {
        TextEncryptor encryptor = Encryptors.text(password, salt);
        System.out.println("Salt: \"" + salt + "\"");
        System.out.println("Original text: \"" + textToEncrypt + "\"");

        String encryptedText = encryptor.encrypt(textToEncrypt);
        System.out.println("Encrypted text: \"" + encryptedText + "\"");

        return encryptedText;
    }

    public static String decrypt(String encryptedText) {
        TextEncryptor decryptor = Encryptors.text(password, salt);
        String decryptedText = decryptor.decrypt(encryptedText);
        //System.out.println("Decrypted text: \"" + decryptedText + "\""); 
        return decryptedText;
    }

    public static void main(String[] args) {
        String s = encrypt("3000000");
        String s2 = decrypt(s);
        System.out.println(s2);

    }
}
