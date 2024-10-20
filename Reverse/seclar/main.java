package Reverse.seclar;

import java.util.Scanner;

public class main {

    public static int secLar(int[] arr) {

        int p = arr[0], vp = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < p) {
                vp = p;
                p = arr[i];
            } else if (arr[i] < vp) {
                vp = arr[i];
            }

        }
        return vp;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int res = secLar(arr);

        System.out.println(res);
    }
}
