package Reverse.factor;

import java.util.Scanner;

public class main {

    public static void printFactors(int n) { // method with datatype parameter

        for (int i = 1; i <= n; i++) { // logic

            if (n % i == 0) {

                System.out.println(i); // return type
            }

        }

    }

    public static void main(String[] args) { // main method

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        printFactors(n); // calling method with parameter

    }

}
