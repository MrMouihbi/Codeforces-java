// Link : https://codeforces.com/problemset/problem/34/B

import java.util.Arrays;
import java.util.Scanner;

public class B34_Sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), a [] = new int [n], s = 0;
        while (--n >= 0)
            a[n] = scanner.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
            if(a[i] < 0)
                s -= a[i];
            else {
                System.out.println(s);
                return;
            }
        }
        System.out.println(s);
    }
}
