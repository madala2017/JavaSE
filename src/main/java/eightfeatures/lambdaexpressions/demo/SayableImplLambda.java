package eightfeatures.lambdaexpressions.demo;

import eightfeatures.lambdaexpressions.service.Sayable;

public class SayableImplLambda {
    public static void main(String[] args) {

        Sayable s = (name) -> {
            return "I have nothing to say,  "+ name;
        };

        Sayable s1 = name -> {
            return "I have nothing to say,  "+ name;
        };

        System.out.println( s.say("Jack"));
        System.out.println( s1.say("John"));
    }
}
