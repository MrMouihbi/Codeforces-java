// Link : https://codeforces.com/problemset/problem/318/A

import java.util.Scanner;

public class A318_EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        System.out.println(k > n/2 + n%2 ? 2*(k - n/2 - n%2) : 2*k - 1);
    }
}
