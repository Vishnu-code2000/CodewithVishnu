package Reverse.ar3large;

import java.util.Scanner;

public class main {

    public static void large(int[] arr) {

        // int large = Integer.MIN_VALUE;// 10
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < large) {
                large = arr[i];
            }
        }
        System.out.println(large);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();
        }

        large(arr);

    }

}
