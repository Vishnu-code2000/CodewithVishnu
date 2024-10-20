package Reverse.darr;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i, j, k;

        int[][][] a = new int[2][3][5];

        for (i = 0; i < a.length; i++) {

            for (j = 0; j < a[i].length; j++) {

                for (k = 0; k < a[i][j].length; k++) {

                    System.out.println("School" + i + "Class" + j + "Student" + k);

                    a[i][j][k] = scan.nextInt();
                }

            }

        }

        for (i = 0; i < a.length; i++)

        {

            for (j = 0; j < a[i].length; j++) {

                for (k = 0; k < a[i][j].length; k++) {

                    System.out.print(a[i][j][k] + " ");

                }
                System.out.println(" ");
            }
            System.out.println(" ");

        }
    }
}
