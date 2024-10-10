package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println(Arrays.toString(a));
            System.out.println("a[" + i + "]와 a[" + (a.length - i -1)+ "]을 교환합니다.");
            swap(a, i, a.length - i -1);
        }
    }

    static int sumOf(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max += a[i];

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소수: ");
        int num = stdIn.nextInt();

        int[] x =  new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);
        sumOf(x);

        System.out.println(Arrays.toString(x));
        System.out.println("역순 정렬을 마쳤습니다.");
        System.out.println("배열 a의 모든 요소의 합: " + sumOf(x));
    }
}
