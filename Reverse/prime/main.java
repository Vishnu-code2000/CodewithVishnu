package Reverse.prime;

import java.util.Scanner;

public class main {

    static String isPrime(int n) {

        // int count = 0;

        // for (int i = 2; i <= n / 2; i++)
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                // count++;
                return "Not Prime";
            }
        }
        return "Prime";
        // if (count == 2) {
        // System.out.println("Prime");
        // } else {
        // System.out.println("Not Prime");
        // }
        // return (count == 0 ? "Prime" : "NotPrime");

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String res = isPrime(n);

        System.out.println(res);
    }
}
