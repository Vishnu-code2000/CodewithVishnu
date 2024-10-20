package Reverse.pairsum;

import java.util.Scanner;

public class main {

    public static int larPairSum(int[] arr) {

        int p = 0, vp = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > p) {

                vp = p;

                p = arr[i];

            } else if (arr[i] > vp) {

                vp = arr[i];
            }
        }
        return (p + vp);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();

        }

        int res = larPairSum(arr);

        System.out.println(res);

    }

}
