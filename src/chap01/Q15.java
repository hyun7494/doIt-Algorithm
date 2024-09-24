package chap01;

import java.util.Scanner;

public class Q15 {
    static void spira(int n) {
        for (int i=1; i<=n; i++) {
            for (int k=1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (int j=1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("n단을 입력하세요: ");
        int n = stdIn.nextInt();
        spira(n);
    }
}
