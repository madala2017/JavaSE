package eightfeatures.lambdaexpressions.demo;

import eightfeatures.lambdaexpressions.service.Drawable;

public class DrawableImplUsingLambda {
    public static void main(String[] args) {

        int width = 20;

        Drawable d = () -> {
            System.out.println("Drawing "+ width);
        };

        d.draw();
    }
}
