package linkedin.courseone.abstractclasses;

abstract class Human {

    public abstract void eat() ;
    public void walk() {

    }
}

class Man extends Human {

    @Override
    public void eat() {

    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Human human = new Man();
    }
}
