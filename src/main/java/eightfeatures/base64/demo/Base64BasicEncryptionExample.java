package eightfeatures.base64.demo;

import java.util.Base64;

public class Base64BasicEncryptionExample {

    public static void main(String[] args) {

        Base64.Encoder encoder = Base64.getEncoder();
        byte[] byteArr = {1,2};
        byte[] bytes = encoder.encode(byteArr);
        System.out.println("\n Encoded byte array: "+ bytes);

        byte[] bytes1 = new byte[5];
        int x = encoder.encode(byteArr,bytes1);
        System.out.println("\n Encoded byte array written to another array: "+ bytes1);
        System.out.println("\n Numer of bytes written: "+ x);

        String str = encoder.encodeToString("JavaTpoint".getBytes());
        System.out.println("\n Encoded string: "+ str);

        Base64.Decoder decoder = Base64.getDecoder();
        String dStr = new String(decoder.decode(str));
        System.out.println("\n Decoded string: "+ dStr);
    }
}
