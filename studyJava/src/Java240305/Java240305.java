package Java240305;

public class Java240305 {
    public static void main(String[] args) {
        // break = 제어문의 중괄호를 탈출시키는 키워드
        for (int i=0; i<10; i++) {
            System.out.println(i);
            if (i > 5) {
                break;
            }
        }
        System.out.println();

        // 이중 for 문에서의 break 사용법
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (j == 3) {
                    i = 99999999; // 매우 큰 수를 세팅해서 바깥 for문 탈출
                    break;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        // 이중 for 문에서의 break 사용법
        out: // 의미 없이 지점 표시 'aaa'로 해도 가능
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (j == 3) {
                    break out;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        // continue 사용법
        for (int i=0; i<10; i++) {
            if (i % 2 == 1) { // 홀수의 경우 아래 출력물을 실행하지 않음
                continue;
                //break;
            }
            System.out.println(i);
        }
        System.out.println();

        // 이중 for 문에서의 continue 사용법
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();



    }
}
