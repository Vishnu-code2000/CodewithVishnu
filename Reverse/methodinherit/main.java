package Reverse.methodinherit;

class Animal {

    void breath() {
        System.out.println("Animal is breathing");
    }

    void eat() {
        System.out.println("Animal will eat food");
    }

    void sleep() {
        System.out.println("Animal will sleep");
    }

}

class Deer extends Animal {

    @Override
    void eat() {
        System.out.println("Deer will eat plant");
    }

    void type() {
        System.out.println("herbivorus");
    }
}

class Tiger extends Animal {

    @Override
    void eat() {
        System.out.println("Tiger eats another animal");
    }

    void type() {
        System.out.println("carnivorus");
    }

}

class Monkey extends Animal {

    @Override
    void eat() {
        System.out.println("Monkey eats banana");
    }

    void type() {
        System.out.println("omnivorus");
    }
}

public class main {

    public static void main(String[] args) {

        Deer d = new Deer();
        d.breath();
        d.eat();
        d.sleep();
        d.type();
        System.out.println("-----------------------------------");

        Tiger t = new Tiger();
        t.breath();
        t.eat();
        t.sleep();
        t.type();

        System.out.println("-----------------------------------");

        Monkey m = new Monkey();
        m.breath();
        m.eat();
        m.sleep();
        m.type();

    }

}
