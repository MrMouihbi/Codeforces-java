// Link : https://codeforces.com/problemset/problem/1374/C

import java.util.Scanner;

public class C1374_MoveBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            short n = scanner.nextShort();
            StringBuilder s = new StringBuilder(scanner.next());
            int pOpeningBrackets = 0, m = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(')
                    pOpeningBrackets++;
                else if(pOpeningBrackets > 0)
                    pOpeningBrackets--;
                else {
                    s.deleteCharAt(i); s.append(')');
                    m++; i--;
                }
            }
            System.out.println(m);
        }
    }
}
