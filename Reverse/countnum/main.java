package Reverse.countnum;

import java.util.Scanner;

public class main {

    public static void countNumber(int num) {
        // int count = 0;

        int sum = 0;
        int rem = 0;
        while (num != 0) {
            // num = num / 10;
            // count++;
            rem = num % 10;
            sum += rem;
            num = num / 10;

        }

        // System.out.println(count);
        System.out.println(sum);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        countNumber(num);
    }

}
