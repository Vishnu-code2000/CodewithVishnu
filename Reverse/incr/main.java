package Reverse.incr;

public class main {

    public static void main(String[] args) {

        int m = 10, n = 10;

        // 10/(121)/10
        int res = m++ / (++n * n--) / --m;

        System.out.println(res);

    }
}
