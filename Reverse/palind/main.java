package Reverse.palind;

import java.util.Scanner;

public class main {

    public static int checkPalind(int n) {

        int rev = 0, last = 0;

        while (n != 0) {
            last = n % 10;// 5432%10=2
            rev = rev * 10 + last;// 20
            n = n / 10;

        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int res = checkPalind(n);

        System.out.println(res);

        System.out.println(n == res ? "palindrome" : "Not palindrome");
    }

}
