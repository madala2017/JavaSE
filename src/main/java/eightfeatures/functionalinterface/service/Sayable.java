package eightfeatures.functionalinterface.service;

@FunctionalInterface
public interface Sayable extends Doable {
    void say(String msg);

    int hashCode();
    String toString();
    boolean equals(Object obj);
}
