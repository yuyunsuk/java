public class Java240304 {
    public static void main(String[] args) {
        // for 반복문의 기본형
        //for (초기식; 조건식; 증감식) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // 무한루프
        // 조건식이 false 가 될 수 있는지 여부를 반드시 확인!!!
//        for (int i = 0; i >= 0; i++) {
//            System.out.println(i);
//        }

//        int a;
//        for (a = 0; a < 3; a++) {
//            System.out.print(a + " ");
//        }
//        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + " ");
        }
        System.out.println();

        /*
        for (int i = 0; ; i++) {
            System.out.print(i + " ");
        }
        for ( ; ; ) {
            System.out.print("무한 루프");
        }
        */
        System.out.println();

        // 무한 루프 탈출
        for (int i = 0; ; i++) {
            if (i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("무한 루프 탈출");
        System.out.println();

//        // for 문 변경하기
//        int i = 0;
//        for (  ;  ;  ) {
//            if (i < 5) {
//                System.out.print(i + " ");
//                i++;
//            } else {
//                break;
//            }
//
//        }
//        System.out.println();

        // 멀티 조건식
        for (int a = 0, b = 0; a < 5 || b < 5; a++, b++) {
            System.out.print(a + "_" + b + " ");
        }
        System.out.println();

        // while 문
        int count = 0; // 초기식
        while (count < 5) { // 조건식
            System.out.print(count + " ");
            count++; // 증감식
        }
        System.out.println();

        // 의도적인 무한루프에서 while 문은 자주 쓰임
//        while (true){
//            // 무한루프
//            // 유저가 버튼을 클릭할때 까지 대기
//            // if (esc 버튼 클릭)
//            // { break; }
//        }

        // do ~ while 문
        int cnt = 0; // 초기식
        do {
            System.out.print(cnt + " ");
            cnt++;
        } while (cnt < 5);
        System.out.println();

        // while 과 do ~ while 문의 비교
        // do ~ while 은 최초 1회 무조건 실행후 조건 비교
        int cnt1 = 5; // 초기식
        do {
            System.out.print(cnt1 + " ");
            cnt1++;
        } while (cnt1 < 5);
        System.out.println();

        // 아래 while 문과 비교하면,
        // 반복문의 조건이 처음부터 false 인 경우
        // do ~ while 문은 실행코드가 1회 실행되는 반면, while문은 실행되지 않음!!!
        int cnt2 = 5; // 초기식
        while (cnt2 < 5) { // 조건식
            System.out.print(cnt2 + " ");
            cnt2++; // 증감식
        }
        System.out.println();

        // do { 매크로호출 } while (false); 매우 오래된 구문

        // 이중루프, 이중반복문
        for (int k=0; k<3; k++) {
            for (int j=0; j<5; j++) {
                System.out.println("[k=" + k +", j=" + j + "]");
            }
        }

        POS1:
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j ==3) {
                    continue POS1;
                }
                System.out.println(i + ", " + j);
            }
        }

        for (int i=0; i<5; i++) {
            for (int j=0; j<3; j++) {
                if (i ==2) {
                    continue;
                }
                if (j ==1) {
                    break;
                }
                System.out.println("A");
            }
        }



    }
}
