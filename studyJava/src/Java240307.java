import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java240307 {
    public static void main(String[] args) {

//        // 6. 아래 배열에서 입력받은 값보다 큰 수만 출력하고, 새로운 변수 배열에 담기.
//        int[] intList1 = {1,2,3,4,5,6,7,8,9,10};
//        Scanner scan1 = new Scanner(System.in);
//        System.out.print("0~10까지 숫자를 입력해주세요 : ");
//        int num = scan1.nextInt();
//
////        int[] intList2 = new int[intList1.length];
//
////        int k = 0;
////        for (int i=0; i<intList1.length; i++) {
////            if (num < intList1[i]) {
////                intList2[k] = intList1[i];
////                k++;
////            }
////        }
////
////        int[] intList3 = new int[k];
////        for (int i=0; i<k; i++) {
////            intList3[i] = intList2[i];
////        }
////
////        System.out.println(Arrays.toString(intList3));
//
//        // 새로운 배열에 담기 : ArrayList 사용하기
//        ArrayList<Integer> intList4 = new ArrayList<Integer>();
//        for (int i=0; i<intList1.length; i++) {
//            if (num < intList1[i]) {
//                intList4.add(intList1[i]);
//            }
//        }
//        System.out.println(intList4.toString());

//        // 7. 아래 배열의 총합과 평균을 출력하시오.
//        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
//
//        int intTotal = 0; // 총합을 위한 정수 변수
//        float fAvg = 0.0f; // 평균을 위한 실수 변수
//
//        for (int i=0; i<numberList.length; i++) {
//            intTotal += numberList[i];
//        }
//        fAvg = (float)intTotal / (float)numberList.length;
//
//        System.out.println("총합은 : "+intTotal);
//        System.out.println("평균은 : "+fAvg);

//        // 8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
//        // 예) hello 를 입력하면 olleh 를 출력
//        Scanner scan2 = new Scanner(System.in);
//        System.out.print("문자열을 입력하시오 : ");
//        String inputText = scan2.nextLine();
//
//        char[] charText = new char[inputText.length()];
//        char[] charChangeText = new char[inputText.length()];
//
//        charText = inputText.toCharArray();
//        System.out.println(Arrays.toString(charText));
//
//        for (int i=0; i<inputText.length(); i++) {
//            charChangeText[i] = charText[inputText.length()-i-1];
//            //System.out.println(inputStr.length()-i-1);
//        }
//        System.out.println(Arrays.toString(charChangeText));

//        [선생님 코드]
//        char[] charList1 = inputStr.toCharArray();
//        char[] charList2 = new char[charList1.length];
//        int index = charList2.length - 1;
//        for (int i=0; i<charList1.length; i++) {
//            charList2[index] = charList1[i];
//            index = index - 1;
//        }
//        System.out.println(Arrays.toString(charList2));
//
//        for (int i=0; i<charList2.length; i++) {
//            System.out.print(charList2[i]);
//        }
//        System.out.println();

//        // 9. 난수 생성법 Random 숫자 만드는 법
//        Random rd = new Random();
//        int randomNumber1 = rd.nextInt(10); // 0 부터 입력한 정수값-1 범위에서 랜덤 (0부터 9까지 랜덤 정수)
//        int randomNumber2 = rd.nextInt(11); // 0 부터 10
//        int randomNumber3 = rd.nextInt(10)+1; // 1 부터 10
//        int randomNumber4 = rd.nextInt(11)+1; // 1 부터 11
//        System.out.println(randomNumber1);
//        System.out.println(randomNumber2);
//        System.out.println(randomNumber3);
//        System.out.println(randomNumber4);

        // 9. 정수 1~45 6개 값을 중복 없이 넣으시오.
//        Random rd1 = new Random();
//        int[] intList = new int[6];
//        int intBefore = 0;
//        int intNew = 0;
//        boolean bDupCheck = false;
//
//        for (int i=0; i< intList.length; i++) {
//            if (i == 0) { // 처음엔 그냥 넣음
//                intList[i] = rd1.nextInt(6) + 1; // (0~44) => 1~45
//            } else { // 두번째 부터 체크
//                for (;;) {
//                    bDupCheck = false; // 중복체크
//                    intNew = rd1.nextInt(6) + 1; // (0~44) => 1~45
//                    for (int j = 0; j < i; j++) { // 2번째 부터 다른 것들과 체크
//                        intBefore = intList[i - j - 1];
//                        //System.out.println("intBefore : "+intBefore);
//                        if (intBefore == intNew) {
//                            bDupCheck = true; // 중복이 있음
//                        }
//                    }
//                    if (bDupCheck == false) { // 중복이 없으면 새로운 숫자 입력
//                        intList[i] = intNew;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(intList));

//        // [선생님 코드1]
//        Random randClass = new Random();
//        int[] rottoList = new int[6];
//        for (int i=0; i<rottoList.length; i++) {
//            int temp = randClass.nextInt(6)+1;
//            for (int j=0; j<i; j++) {
//                if (rottoList[j] == temp) {
//                    temp = randClass.nextInt(6)+1;
//                    j = -1; // 증감 조건으로 가기 때문에 j를 0으로 만들기 위해서.
//                }
//            }
//            rottoList[i] = temp;
//        }
//        System.out.println(Arrays.toString(rottoList));

        // [선생님 코드2]
        Random randClass = new Random();
        int[] rottoList = new int[6];

        for (int i=0; i<rottoList.length; i++) {
            rottoList[i] = randClass.nextInt(6)+1;
            for (int j=0; j<i; j++) {
                if (rottoList[j] == rottoList[i]) {
                    i--; // 새로운 값과 기존값 중 같은것이 있으면 i를 진행시키지 못하도록 다시 뒤로 돌림.
                }
            }
        }
        System.out.println(Arrays.toString(rottoList));



    }
}
