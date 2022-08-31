// Link : https://codeforces.com/problemset/problem/1721/A

import java.util.Scanner;

public class A1721_Image {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            String s = scanner.next();
            s += scanner.next();
            String sd = s.charAt(0) + "";
            for (int i = 0; i < 4; i++)
                if(sd.indexOf(s.charAt(i)) == -1) sd += s.charAt(i);
            System.out.println(sd.length() - 1);
        }
    }
}
