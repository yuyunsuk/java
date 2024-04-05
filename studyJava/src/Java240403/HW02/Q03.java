package Java240403.HW02;

import java.util.*;

public class Q03 {
    public static void main(String[] args) {
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함

        // 여기 코드 작성 !!
        Scanner sc = new Scanner(System.in);
        Set<String> inputLHSet = new LinkedHashSet<>();
        //Set<String> inputHSet = new HashSet<>();
        for (int i=0; i<5; i++) {
            inputLHSet.add(sc.next());
            //inputHSet.add(sc.next());
        }
        System.out.println(inputLHSet.toString()); // 중복제외 입력 순서대로 출력
        //System.out.println(inputHSet.toString()); // 중복제외 순서 상관없이 출력



    }
}
