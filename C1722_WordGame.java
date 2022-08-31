// Link : https://codeforces.com/problemset/problem/1722/C

import java.util.HashMap;
import java.util.Scanner;

public class C1722_WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        while (t-- > 0) {
            short n = scanner.nextShort(),
                    p1Score = (short) (3*n), p2Score = (short) (3*n), p3Score = (short) (3*n);

            HashMap<String, Integer> map = new HashMap<String, Integer>();
            // null = not used / 1 = used by one / 2 = used by 2 / 3 = used by 1 & 2

            for (int i = 0; i < 3 * n; i++) {
                if(i < n) map.put(scanner.next(), 1);
                else if(i < 2 * n)  {
                    String s = scanner.next();
                    if (map.get(s) == null)
                        map.put(s, 2);
                    else {
                        map.put(s, 3);
                        p1Score -= 2; p2Score -= 2;
                    }
                } else {
                    String s = scanner.next();
                    int mapS = map.get(s) == null ? -1 : map.get(s);
                    if(mapS == -1) continue;
                    switch (mapS) {
                        case 1 :
                            p1Score -= 2; p3Score -= 2;
                            break;
                        case 2 :
                            p2Score -= 2; p3Score -= 2;
                            break;
                        case 3 :
                            p1Score -= 1; p2Score -= 1; p3Score -= 3;
                    }
                }
            }
            System.out.println(p1Score + " "+ p2Score + " " + p3Score);
        }
    }
}