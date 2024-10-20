package Reverse.copyarr;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int[] a = { 1, 8, 4 };

        int[] b = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        // b = a;

        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");

            System.out.println(Arrays.equals(a, b));

            // if (val == true) {
            // System.out.println("yes");
            // }
        }

    }

}
