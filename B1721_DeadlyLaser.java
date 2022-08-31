// Link : https://codeforces.com/problemset/problem/1721/B

import java.util.Scanner;

public class B1721_DeadlyLaser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int counter = 0, x = 1, y = 1;
            int n = scanner.nextInt(), m =scanner.nextInt(),
            sx = scanner.nextInt(), sy = scanner.nextInt(), d = scanner.nextInt();
            // try priority to increase x
            while (x < n || y < m) {
                if(x < n && outLaser(x+1, y, sx, sy, d)) {
                    x++; counter++;
                }
                else if(y < m && outLaser(x, y+1, sx, sy, d)){
                    y++; counter++;
                }
                else {
                    break;
                }
            }
            if(x == n && y == m)
                System.out.println(counter);
            else {
                // try priority to increase y
                counter = 0; x = 1; y = 1;
                while (x < n || y < m) {
                    if(y < m && outLaser(x, y+1, sx, sy, d)){
                        y++; counter++;
                    }
                    else if(x < n && outLaser(x+1, y, sx, sy, d)) {
                        x++; counter++;
                    }
                    else {
                        break;
                    }
                }
                if(x == n && y == m)
                    System.out.println(counter);
                else
                    System.out.println(-1);
            }

        }
    }

    public static boolean outLaser(int x, int y, int xl, int yl, int d) {
        return Math.abs(xl - x) + Math.abs(yl - y) != d;
    }
}
