// Link : https://codeforces.com/problemset/problem/1138/A

import java.util.Scanner;

public class A1138_SushiForTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), len = 1, prev = 0, oneSeq = 0, twoSeq = 0;
        while (n-- > 0) {
            byte x = scanner.nextByte();
            if(x == 1) {
                oneSeq = prev == 1 ? oneSeq + 1 : 1;
                prev = 1;
            } else {
                twoSeq = prev == 2 ? twoSeq + 1 : 1;
                prev = 2;
            }
            if (Math.min(oneSeq, twoSeq) > len)
                len = Math.min(oneSeq, twoSeq);
        }
        System.out.println(len * 2);
    }
}