package chap01;

import java.util.Scanner;

public class SumFor2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("n이 양수일 경우, 1부터 n까지의 합을 구하기");
        do {
            System.out.print("n을 입력해주세요: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다");
    }


}
