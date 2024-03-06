import java.util.Arrays;
import java.util.Scanner;

public class Java20240306Array {
    public static void main(String[] args) {
        // 1. 길이가 10인 배열에 1부터 10까지 값을 입력
        int[] intList1 = new int[10];

        for (int i=0; i<10; i++) {
            intList1[i] = i + 1;
        }
        System.out.println(Arrays.toString(intList1));

        // 2. 길이가 10인 배열에 10부터 1까지 값을 입력
        int[] intList2 = new int[10];
        int cnt = intList2.length;
        for (int i=0; i<cnt; i++) {
            intList2[i] = cnt - i;
        }
        System.out.println(Arrays.toString(intList2));

        // 3. 아래 과일 배열에 "사과"가 몇번 들어있는지 확인
        String[] fruitList = {"배","사과","바나나","딸기","사과","수박"};

        int cnt1 = fruitList.length;
        String str1 = "사과";
        int intApple = 0;
        for (int i=0; i<cnt1; i++) {
            if(fruitList[i].equals(str1)) {
                intApple++;
            }
        }
        System.out.println(str1 + "는 "+intApple+"개 있습니다.");

//        int[][] a = new int[2][];
//        a[0] =  new int[3];
//        a[1] =  new int[2];
//
//        a[0][0] = 1;
//        a[0][1] = 3;
//        a[0][2] = 5;
//        a[1][0] = 7;
//        a[1][1] = 9;
//
//        for (int i=0; i<a.length; i++) {
//            for (int j=0; j<a[i].length; j++) {
//                System.out.println(a[i][j]);
//            }
//        }
//        System.out.println();

        // 9. 길이가 3인 배열에 다른 배열의 값 입력
        int[] intList11 = new int[3];
        int[] intList21 = {100, 200, 300};

        for (int i=0; i<3; i++) {
            intList11[i] = intList21[i];
        }
        System.out.println(Arrays.toString(intList11));

//        // 2차원 출력
//        System.out.println("2차원 for-each 출력");
//        int[][] a1 = {{1,2}, {3,4,5}};
//
//        for (int[] i : a1) {
//            for (int j : i) {
//                System.out.println(j);
//            }
//        }

          // 자바에서 입력값을 받는 방법
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("0~6까지 숫자를 입력해주세요 : ");
//        int inputNumber = sc1.nextInt();
//
//        if (inputNumber >=0 && inputNumber <=6) {
//            System.out.println(inputNumber);
//        } else {
//            System.out.println("잘못 입력하셨습니다.");
//        }
//
//        // 자바에서 문자열 받는 방법
//        Scanner sc2 = new Scanner(System.in);
//        System.out.print("이름을 입력해주세요 : ");
//        String inputStr = sc2.nextLine();
//
//        System.out.println(inputStr);

//        // 4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
//        char[] week = {'월','화','수','목','금','토','일'};
//        Scanner sc3 = new Scanner(System.in);
//        System.out.print("0~6까지 숫자를 입력해주세요 : ");
//        int num = sc3.nextInt();
//
//        if (num >=0 && num <=6) {
//            System.out.println(week[num]);
//        } else {
//            System.out.println("잘못 입력하셨습니다.");
//        }

        // 5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // "~~~님 환영합니다." 를 출력하고
        // 없으면 "회원가입해주세요." 를 출력 (단, 대소문자 구분하지 마시오)
        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};

        Scanner sc4 = new Scanner(System.in);
        System.out.print("이름을 입력하여 주세요: ");
        String inputName = sc4.nextLine();

        boolean bCheck = false;
        for (int i=0; i< members.length; i++) {
            if (inputName.equalsIgnoreCase(members[i])) {
                System.out.println(inputName.concat("님 환영합니다."));
                bCheck = true;
                break;
            }
        }

        if (bCheck == false) {
            System.out.println("화원가입해주세요");
        }

//        for (int i=0; i< members.length; i++) {
//            if (inputName.equalsIgnoreCase(members[i])) {
//                System.out.println(inputName.concat("님 환영합니다."));
//                bCheck = true;
//                break;
//            }
//            if (i == members.length - 1) {
//                System.out.println("화원가입해주세요");
//            }
//        }



    }
}
