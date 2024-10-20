package Reverse.build;

import java.util.Scanner;

import java.lang.StringBuffer;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String st = scan.next();

        // StringBuilder sb = new StringBuilder(st);

        // System.out.println(sb.reverse());

        StringBuffer sb = new StringBuffer(st);

        System.out.println(sb.reverse());

    }

}
