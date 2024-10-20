package Reverse.betweenprime;

import java.util.Scanner;

public class main {

    static void primeNumbers(int a, int b) {
        for (int n = a; n <= b; n++) {
            if (printPrime(n)) {
                System.out.println(n);
            }
        }

    }

    static boolean printPrime(int n) {

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();// 10

        int b = scan.nextInt();// 20

        primeNumbers(a, b);

    }
}
