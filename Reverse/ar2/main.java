package Reverse.ar2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();
        }
        // 0 1 2 3
        for (int i = 1; i < arr.length; i++) { // 10 20 30 40
            sum += arr[i];

        }

        System.out.println(sum);
    }

}
