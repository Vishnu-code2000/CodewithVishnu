package Reverse.commonfact;

import java.util.Scanner;

public class main {

    public static void commonFactors(int a, int b) {

        int min = a < b ? a : b;
        // for (int i = 1; i < min; i++)
        for (int i = min; i >= 1; i--) {

            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int b = scan.nextInt();

        commonFactors(a, b);
    }
}
