package eightfeatures.defaultmethods.service;

public interface Sayable {

    default void say() {
        System.out.println("Hello, this is default method");
    }

    void sayMore(String msg);

    static void sayLouder(String msg) {
        System.out.println(msg);
    }
}
