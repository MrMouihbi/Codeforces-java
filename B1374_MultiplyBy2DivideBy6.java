// Link : https://codeforces.com/problemset/problem/1374/B

import java.util.Scanner;

public class B1374_MultiplyBy2DivideBy6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(), counter = 0, r = n % 6;
            while (n > 1 && r != 2 && r != 4) {
                n = r == 0 ? n / 6 : n * 2;
                r = n % 6;
                counter++;
            }
            System.out.println(n == 1 ? counter : -1);
        }
    }
}
