package chap01;

import java.util.Scanner;

public class Multi99Table {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("n * m 단 곱셈");

        System.out.print("n을 입력해주세요: ");
        int n = stdIn.nextInt();
        System.out.print("m을 입력해주세요: ");
        int m = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

    }

}
