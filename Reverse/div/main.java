package Reverse.div;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num % 100 == 73) {

            System.out.println("yes");
        } else {

            System.out.println("no");
        }
    }
}
