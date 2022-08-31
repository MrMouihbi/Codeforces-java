// Link : https://codeforces.com/problemset/problem/1722/B

import java.util.Scanner;

public class B1722_Colourblindness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        test : while (t-- > 0) {
            byte n = scanner.nextByte();
            String row1 = scanner.next(), row2 = scanner.next();
            for (int i = 0; i < n; i++) {
                if(row1.charAt(i) == 'R' ^ row2.charAt(i) == 'R') {
                    System.out.println("NO");
                    continue test;
                }
            }
            System.out.println("YES");
        }
    }
}
