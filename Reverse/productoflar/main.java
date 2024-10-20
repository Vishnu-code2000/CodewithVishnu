package Reverse.productoflar;

import java.util.Scanner;

public class main {

    public static int larProduct(int[] arr) {

        int p = arr[0], vp = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > p) {

                vp = p;

                p = arr[i];
            } else if (arr[i] > vp) {

                vp = arr[i];
            }

        }
        return (p * vp);
    }

    public static int smallProduct(int[] arr) {

        int p = arr[0], vp = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < p) {

                vp = p;

                p = arr[i];
            } else if (arr[i] < vp) {

                vp = arr[i];
            }

        }
        return (p * vp);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();
        }

        int lar = larProduct(arr);
        int small = smallProduct(arr);

        System.out.println(lar);
        System.out.println(small);

        if (lar > small) {
            System.out.println(lar);
        }
    }
}
