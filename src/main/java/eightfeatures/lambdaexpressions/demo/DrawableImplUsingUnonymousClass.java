package eightfeatures.lambdaexpressions.demo;

import eightfeatures.lambdaexpressions.service.Drawable;

public class DrawableImplUsingUnonymousClass {
    public static void main(String[] args) {

        int width = 10;

        // without lambda, Draable implementation using anonymous class

        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing "+ width);
            }
        };

        d.draw();
    }
}
