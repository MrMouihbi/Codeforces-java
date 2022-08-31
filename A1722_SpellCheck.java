// Link : https://codeforces.com/problemset/problem/1722/A

import java.util.Scanner;

public class A1722_SpellCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        test : while (t-- > 0) {
            byte n = scanner.nextByte();
            String s = scanner.next();
            if (n != 5)
                System.out.println("NO");
            else {
                for (char c : "Timur".toCharArray()) {
                    if(s.indexOf(c) == -1) {
                        System.out.println("NO");
                        continue test;
                    }
                }
                System.out.println("YES");
            }
        }
    }
}
