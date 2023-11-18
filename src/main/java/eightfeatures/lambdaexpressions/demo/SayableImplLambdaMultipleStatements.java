package eightfeatures.lambdaexpressions.demo;

import eightfeatures.lambdaexpressions.service.Sayable;

public class SayableImplLambdaMultipleStatements {
    public static void main(String[] args) {

        Sayable person = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
