package Reverse.str;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = "Java is a platform independent";// String container

        // char[] a = s.toCharArray();

        // for (int i = 0; i < a.length; i++) {

        // System.out.println(a[i]);

        // }

        // for (char ch : a) {
        // System.out.println(ch);
        // }
        // System.out.println(s.strip());

        // for (int i = 0; i < sam.length; i++) {
        // System.out.println(sa);
        // }

        String[] sams = s.split(" ");

        for (String sam : sams) {
            System.out.println(sam);
        }
        // System.out.println(s.toUpperCase());
        // System.out.println(s.toLowerCase());
        // System.out.println(s.charAt(0));
        // System.out.println(s.indexOf('i'));
        // System.out.println(s.lastIndexOf('i'));
        // System.out.println(s.codePointAt('a'));
        // System.out.println(s.length());
        // System.out.println(s.contains("form"));
        // System.out.println(s.startsWith("J"));
        // System.out.println(s.endsWith("J"));

        // System.out.println(s.split(","));

        // System.out.println(s.isEmpty());

        // String s2 = "Javajar";// String container
        // String s1 = new String("JavaCap");// heap

        // String s2 = new String("Java");// heap

        // System.out.println("Java" == s2);

        // System.out.println(s1.compareTo(s2));

    }

}
