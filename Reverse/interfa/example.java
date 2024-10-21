package Reverse.interfa;

import java.util.Scanner;

interface Calculator {

    public abstract void add();

    public abstract void sub();
}

class Calculator1 implements Calculator {

    @Override
    public void add() {
        // TODO Auto-generated method stub
        System.out.println(100 + 200);

    }

    @Override
    public void sub() {
        // TODO Auto-generated method stub
        System.out.println(200 - 100);

    }
}

class Calculator2 implements Calculator {

    @Override
    public void add() {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1");
        int a = scan.nextInt();
        System.out.println("Enter the number2");
        int b = scan.nextInt();
        if (a > b) {
            System.out.println(a + b);
        } else {
            System.out.println("invalid operation");
            System.exit(0);
        }

    }

    @Override
    public void sub() {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1");
        int number1 = scan.nextInt();
        System.out.println("Enter the number2");
        int number2 = scan.nextInt();
        if (number2 > number1) {
            System.out.println(number2 - number1);
        } else {
            System.out.println("invalid");
            System.exit(0);
        }

    }
}

class Calculator3 implements Calculator {
    @Override
    public void add() {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1");
        int a = scan.nextInt();
        System.out.println("Enter the number2");
        int b = scan.nextInt();
        if (a < b) {
            System.out.println(a + b);
        } else {
            System.out.println("invalid");
            System.exit(0);
        }

    }

    @Override
    public void sub() {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1");
        int number1 = scan.nextInt();
        System.out.println("Enter the number2");
        int number2 = scan.nextInt();
        if (number2 < number1) {
            System.out.println(number2 - number1);
        } else {
            System.out.println("invalid");
            System.exit(0);
        }

    }
}

class sam {
    public void permit(Calculator ref) {
        ref.add();
        ref.sub();
    }
}

public class example {

    public static void main(String[] args) {

        Calculator c1 = new Calculator1();
        Calculator c2 = new Calculator2();
        Calculator c3 = new Calculator3();

        sam s = new sam();
        s.permit(c1);
        s.permit(c2);
        s.permit(c3);

    }

}
