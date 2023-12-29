package eightfeatures.defaultmethods.model;

import eightfeatures.defaultmethods.service.Interface1;
import eightfeatures.defaultmethods.service.Interface2;

public class MyClass implements Interface1, Interface2 {

    @Override
    public void method1(String str) {

    }

    @Override
    public void method2() {

    }

    @Override
    public void log(String str) {
        Interface1.super.log(str);
    }
}
