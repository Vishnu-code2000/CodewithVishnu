package Reverse.firstnpprime;

import java.util.Scanner;

public class main {

    static boolean checkPrime(int i) {

        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    static void printNPrime(int n) {
        int count = 0;
        for (int i = 1; count < n; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                count++;
            }
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        printNPrime(n);
    }

}
