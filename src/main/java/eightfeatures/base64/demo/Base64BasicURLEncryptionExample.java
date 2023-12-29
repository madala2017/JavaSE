package eightfeatures.base64.demo;

import java.util.Base64;

public class Base64BasicURLEncryptionExample {

    public static void main(String[] args) {

        Base64.Encoder encoder = Base64.getUrlEncoder();
        String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial".getBytes());
        System.out.println("\n Encoded URL: "+eStr);

        Base64.Decoder decoder = Base64.getUrlDecoder();
        String dStr = new String(decoder.decode(eStr));
        System.out.println("\n Decoded URL: "+dStr);
    }
}
