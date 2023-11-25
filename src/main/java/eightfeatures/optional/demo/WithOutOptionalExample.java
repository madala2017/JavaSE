package eightfeatures.optional.demo;

public class WithOutOptionalExample {

    public static void main(String[] args) {

        String[] str = new String[10];
        String lowercaseString = str[5].toLowerCase();

        System.out.println(lowercaseString);
    }
}
