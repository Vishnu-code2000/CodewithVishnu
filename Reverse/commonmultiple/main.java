package Reverse.commonmultiple;

import java.util.Scanner;

public class main {

    public static void commonMultiple(int n, int a, int b) {

        // for (int i = 1; i <= n; i++) {
        // int c = a * b;
        // if (i % c == 0) {
        // System.out.println(i);
        // }
        // }
        int count = 0;
        for (int i = 1; count < n; i++) {

            if (i % a == 0 && i % b == 0) {

                System.out.println(i);
                count++;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int a = scan.nextInt();

        int b = scan.nextInt();

        commonMultiple(n, a, b);

    }
}
