package eightfeatures.lambdaexpressions.demo;

import eightfeatures.lambdaexpressions.service.Addable;

public class AddableImplLambda {
    public static void main(String[] args) {

        Addable add1 = (a,b) -> (a+b);
        System.out.println(add1.add(40,10));

        Addable add2 = (int a, int b) -> (a+b);
        System.out.println(add2.add(30,10));
;
    }
}
