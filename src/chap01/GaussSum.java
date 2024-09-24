package chap01;

import java.util.Scanner;

public class GaussSum {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 가우스 덧셈으로 구하기");
        System.out.print("n값을 입력해주세요: ");

        int n = stdin.nextInt();
        int sum = 0;
        if (n % 2 == 0) {
            sum = (1+n)*(n/2);
        }
        else {
            sum = (1+n)*(n/2+1);
        }
        System.out.println("1부터 n까지의 합을 가우스 덧셈으로 구한 값: " + sum + "입니다.");
    }

}
