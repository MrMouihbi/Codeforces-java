// Link : https://codeforces.com/problemset/problem/1722/D

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class D1722_Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String line = scanner.next();

            if (n == 1) {
                System.out.println(0);
                continue;
            }

            // initializations
            long value = 0;
            Stack<Integer> stackR = new Stack<>();
            Queue<Integer> queueL = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (line.charAt(i) == 'L') {
                    queueL.add(i);
                    value += i;
                } else {
                    stackR.push(i);
                    value += n - 1 - i;
                }
            }

            // calculate each k
            int mid = n / 2 - 1;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append(" "); //*
                if (stackR.isEmpty() && queueL.isEmpty()) result.append(value);
                else if(stackR.isEmpty()) {
                    if (queueL.peek() <= mid)
                        value = poll(queueL, value, n);
                    result.append(value);
                } else if (queueL.isEmpty()) {
                    if (stackR.peek() > mid)
                        value = pop(stackR, value, n);
                    result.append(value);
                } else {
                    if (stackR.peek() > mid && queueL.peek() <= mid) {
                        value = value - n + 1 + 2 * stackR.peek() > value + n - 1 - 2 * queueL.peek() ?
                                pop(stackR, value, n) : poll(queueL, value, n);
                    } else if (stackR.peek() > mid)
                        value = pop(stackR, value, n);
                    else if (queueL.peek() <= mid)
                        value = poll(queueL, value, n);

                    result.append(value);
                }
            }
            System.out.println(result.deleteCharAt(0)); //*
        }
    }

    public static long pop(Stack<Integer> stack, long value, int n) {
        int pos = stack.pop();
        return value + 1 - n + 2 * pos;
    }

    public static long poll(Queue<Integer> q, long value, int n) {
        int pos = q.poll();
        return value + n - 1 - 2 * pos;
    }
}