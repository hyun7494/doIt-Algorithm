package chap01;

import java.util.Scanner;

public class SumOf {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환");

        System.out.print("정수 a를 입력: ");
        int a = stdIn.nextInt();
        System.out.print("정수 b를 입력: ");
        int b = stdIn.nextInt();

        int sum = (b-a) % 2 == 1 ? (a+b)*((b-a)/2+1) : (a+b)*((b-a)/2)+(a+b)/2;
        System.out.println("정답: " + sum + "입니다.");
    }
}
