package Java240307;

import java.util.Arrays;
import java.util.Random;

public class Java240307Test {
    public static void main(String[] args) {

        Random rc = new Random();
        int[] intList = new int[6];

        for (int i=0; i<intList.length; i++) {
            intList[i] = rc.nextInt(6)+1;
            for (int j=0; j<i; j++) {
                if (intList[i] == intList[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(intList));

        // 10 부터 1까지 입력
        int[] intList2 = new int[10];
        for (int i=0; i<intList2.length; i++) {
            intList2[i] = intList2.length - i;
        }
        System.out.println(Arrays.toString(intList2));

    }
}
