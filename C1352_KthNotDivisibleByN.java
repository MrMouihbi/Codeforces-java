// Link : https://codeforces.com/problemset/problem/1352/C

import java.util.Scanner;

public class C1352_KthNotDivisibleByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        while (t-- > 0) {
            int n = scanner.nextInt(), k = scanner.nextInt();
            System.out.println(k < n ? k : k + k / (n-1) - (k % (n-1) == 0 ? 1 : 0));
        }
    }
}

/*
    ---------------------- Explanation ----------------------

    * For each k < n , the Kth not divisible is k
    * For each k >= n , r is the Kth not divisible
        - For n = 3
            k                  : 1,2  3,4  5,6  7,8    ...
            not divisibles (r) : 1,2  4,5  7,8  10,11  ...
        =>  Groups             : G1   G2   G3   G4     ...
        Every n - 1 , we create a new group, because the gap
        between k and r will increase by 1 (a divisible will
        appear every n times, we have to skip it)

        - For n = 4
            k                  : 1,2,3  4,5,6  7,8,9   ...
            not divisibles (r) : 1,2,3  5,6,7  8,9,10  ...
        =>  Groups             : G1     G2     G3      ...

        For every n, for k > n : r = k + Group Number - 1

        Group Number = k / (n - 1) + 1 if k % (n - 1) != 0
        Group Number = k / (n - 1)     if k % (n - 1) == 0

        Line 11 == these two lines :
        int groupNumber = k / (n-1) + (k % (n-1) == 0 ? 0 : 1);
        System.out.println(k < n ? k : k + groupNumber - 1);

 */