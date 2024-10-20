package Reverse.staticex;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        BusinessMan bM = new BusinessMan();

        bM.acceptInput();
        bM.calculateSimpleInterest();
        bM.disp();

    }
}

class BusinessMan {

    private float p;
    private float t;
    private float si;

    static private float r; // y we given as static because utilize memory efficiently

    static {

        r = 15.2f;
    }

    void acceptInput() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principle");
        p = scan.nextFloat();

        System.out.println("Enter the time");
        t = scan.nextFloat();

    }

    void calculateSimpleInterest() {

        si = p * t * r / 100;
    }

    void disp() {
        System.out.println(si);
    }
}
