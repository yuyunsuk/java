import java.util.Arrays;

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

        int[][] a = new int[2][];
        a[0] =  new int[3];
        a[1] =  new int[2];

        a[0][0] = 1;
        a[0][1] = 3;
        a[0][2] = 5;
        a[1][0] = 7;
        a[1][1] = 9;

        // 아래 과일 배열에 "사과"가 몇번 들어있는지 확인
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














        // 9. 길이가 3인 배열에 다른 배열의 값 입력
        int[] intList11 = new int[3];
        int[] intList21 = {100, 200, 300};

        for (int i=0; i<3; i++) {
            intList11[i] = intList21[i];
        }
        System.out.println(Arrays.toString(intList11));
    }
}
