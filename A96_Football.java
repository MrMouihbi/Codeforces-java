// Link : https://codeforces.com/problemset/problem/96/A

import java.util.Scanner;

public class A96_Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(
                input.contains("1111111") || input.contains("0000000")?
                "YES":"NO"
        );
    }
}
