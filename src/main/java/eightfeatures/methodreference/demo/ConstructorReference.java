package eightfeatures.methodreference.demo;

import eightfeatures.methodreference.model.Message;
import eightfeatures.methodreference.service.Messageable;

public class ConstructorReference {

    public static void main(String[] args) {

        Messageable hello = Message::new;

        hello.getMessage("Hello class");
    }
}
