package Reverse.condition;

import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 15 == 0) {
            System.out.println("bangalore");
        } else if (n % 5 == 0) {
            System.out.println("tap");
        } else if (n % 3 == 0) {
            System.out.println("act");
        } else {
            System.out.println("Invalid");
        }
    }
}