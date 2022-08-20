// Link : https://codeforces.com/problemset/problem/750/A

import java.util.Scanner;

public class A750_NewYearAndHurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        short time = (short) (240 - scanner.nextInt());
        byte s = 0;
        while ( time >= (s + 1) * 5 && s < n) time -= ++s * 5;
        System.out.println(s);
    }
}