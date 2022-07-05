package RECORD;

import java.util.Arrays;
import java.util.Scanner;

// Program to Sort strings

public class stringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("count of the strings");
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the string");
            str[i] = sc.next();
        }
        Arrays.sort(str);
        System.out.println("sorted string");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

    }

}
