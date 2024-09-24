package chap01;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.print("양의 정수 n을 입력해주세요: ");
        n = stdIn.nextInt();
        int count = 1;

        while (n >= 10) {
            n /= 10;
            count ++;
        }

        System.out.println("그 수는 "+ count + "자리입니다.");
    }
}
