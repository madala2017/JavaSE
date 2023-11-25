package eightfeatures.functionalinterface.service;

public interface Doable {

    default void doIt() {
        System.out.println("Do it now");
    }
}
