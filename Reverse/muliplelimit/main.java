package Reverse.muliplelimit;

import java.util.Scanner;

public class main {

    static void printMultiple(int n, int x) {
        // for (int i = 1; i <= n / 10; i++) {
        // if (x <= n) {
        // System.out.println(x * i);
        // }
        // }

        for (int i = 1; i <= x; i++) {

            if (i % n == 0) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt(); // 30

        int n = scan.nextInt();// 10

        printMultiple(n, x);

    }

}
