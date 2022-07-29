// Link : https://codeforces.com/problemset/problem/133/A

import java.util.Scanner;

public class A133_HQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            if (    input.charAt(i) == 'H' ||
                    input.charAt(i) == 'Q' ||
                    input.charAt(i) == '9'    ) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
