// Link : https://codeforces.com/problemset/problem/1703/A

import java.util.Scanner;

public class A1703_YESorYES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            System.out.println(scanner.next().equalsIgnoreCase("yes") ? "YES" : "NO");
        }
    }
}
