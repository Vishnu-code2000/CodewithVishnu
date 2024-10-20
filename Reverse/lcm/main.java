package Reverse.lcm;

import java.util.Scanner;

public class main {

    public static void lcm(int a, int b) {

        System.out.println(a * b / gcd(a, b));
    }

    public static int gcd(int a, int b) {

        int min = a < b ? a : b;

        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;

            }

        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int b = scan.nextInt();

        lcm(a, b);
    }

}
