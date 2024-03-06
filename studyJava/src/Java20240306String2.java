import java.util.Arrays;

public class Java20240306String2 {
    public static void main(String[] args) {
        String str1 = "Java Study";
        // Study 를 못찾으면 변경하지 않고 원본 그대로 둠
        System.out.println(str1.replace("Study", "공부"));

        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        // 두번째 파라미터로 사용된 인덱스는 포함되지 않음 (0 <= 범위 < 5)
        System.out.println(str1.substring(0, 5)); //"Java "
        System.out.println(str1.substring(0, 4)); //"Java"
        System.out.println(str1.substring(0, 3)); //"Jav"

        // 연산자를 이용하여 ':'와 '/' 기준으로 분리시킴
        // split 메소드의 리턴형은 String[] 문자열의 배열이다!!!
        String[] strArray = "Name:Michael/Man".split(":|/");
        System.out.println(Arrays.toString(strArray));

        // "앞뒤" 공백지우기
        String _str1 = "   abc edf   ";
        _str1 = _str1.trim();
        System.out.println(_str1);

        // 모든 공백 지우기
        System.out.println(_str1.replaceAll(" ", ""));

        // 길이가 10인 배열에 1부터 10까지 값을 입력
        int[] intArray1 = {1,2,3,4,5,6,7,8,9,10};
        int[] intArray2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] intArray3 = new int[10];
        intArray3[0] = 1;
        intArray3[1] = 2;
        intArray3[2] = 3;
        intArray3[3] = 4;
        intArray3[4] = 5;
        intArray3[5] = 6;
        intArray3[6] = 7;
        intArray3[7] = 8;
        intArray3[8] = 9;
        intArray3[9] = 10;

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));

        int[] intArray4 = new int[10];

        for (int i=0; i<10; i++) {
            intArray4[i] = i+1;
        }
        System.out.println(Arrays.toString(intArray4));



    }
}
