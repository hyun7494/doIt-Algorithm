package chap01;

import java.util.Scanner;

public class Q14 {
    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void triangleLU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("n값을 입력하세요: ");
        int n = stdIn.nextInt();
        triangleLB(n);
        System.out.println();
        triangleLU(n);
    }
}
