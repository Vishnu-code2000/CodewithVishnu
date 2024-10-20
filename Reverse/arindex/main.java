package Reverse.arindex;

import java.util.Scanner;

public class main {

    public static void printIndex(int[] arr) {

        int large = arr[0], index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
                index = i;
            }

        }
        System.out.println(index);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();
        }

        printIndex(arr);

    }

}
