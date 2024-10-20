package Reverse.arr4kth;

import java.util.Scanner;

public class main {
    // n 5 10 20 10 30 >> 10 o/p-2

    public static int countKelement(int k, int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == k) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();// 5
        int k = scan.nextInt();// 7

        int[] arr = new int[n];// 3 7 2 7 1

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();

        }

        int res = countKelement(k, arr);

        System.out.println(res);

    }
}
