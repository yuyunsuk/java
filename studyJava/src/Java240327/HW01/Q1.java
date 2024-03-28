package Java240327.HW01;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // 변수 num을 유저로부터 입력받아서 양수, 음수, 0 을 구별하는 코드를
        // 작성하시오. 단, if 조건문이 아닌 삼항연산자를 사용해야함.
        /* 결과 예시
            입력값이 10이면 "양수" 출력
            입력값이 0이면 "0" 출력
            입력값이 -10이면 "음수" 출력 * */
        // [HW01]이름.zip => Q1.java, Q2.java, Q3.java, Q4.java 파일
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(
            (num > 0) ? "입력값["+num+"]은 양수입니다."
            : ((num == 0) ? "입력값["+num+"]은 0 입니다." : "입력값["+num+"]은 음수입니다.")
        );

    }
}
