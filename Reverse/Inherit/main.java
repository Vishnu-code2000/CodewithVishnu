package Reverse.Inherit;

class Parent {// extends Object
    int a;
    int b;

    public Parent() {

        a = 300;
        b = 400;
    }

    public Parent(int a, int b) {// 5,6
        this.a = a;
        this.b = b;
    }
}

class Child extends Parent {

    int x;

    int y;

    Child() {
        this(5, 6);
        x = 100;
        y = 200;

    }

    Child(int x, int y) {
        super(x, y);// 5,6
        this.x = x;
        this.y = y;
    }

    void disp() {

        System.out.println(x);// 100
        System.out.println(y);// 200
        System.out.println(a);// 5
        System.out.println(b);// 6

    }
}

public class main {

    public static void main(String[] args) {

        Child c = new Child();

        c.disp();

    }

}
