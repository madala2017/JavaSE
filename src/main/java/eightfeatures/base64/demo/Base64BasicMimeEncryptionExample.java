package eightfeatures.base64.demo;

import java.util.Base64;

public class Base64BasicMimeEncryptionExample {

    public static void main(String[] args) {

        Base64.Encoder encoder = Base64.getMimeEncoder();

        String message = "Hello, \nYou are informed regarding your inconsistency of work";

        String eStr = encoder.encodeToString(message.getBytes());
        System.out.println("\nEncoded MIME message: "+eStr);

        Base64.Decoder decoder = Base64.getMimeDecoder();
        String dStr = new String(decoder.decode(eStr));
        System.out.println("\nDecoded message: "+ dStr);
    }
}
