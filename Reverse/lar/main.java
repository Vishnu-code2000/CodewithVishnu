package Reverse.lar;

public class main {

    public static int lar(int[] arr) {

        int lar = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > lar) {
                lar = arr[i];
            }

        }
        return lar;

    }

    public static void main(String[] args) {

        int[] arr = { 10, 30, 20, 15 };

        int res = lar(arr);

        System.out.println(res);
    }
}
