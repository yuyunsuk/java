package Java240327;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        // 방법1. 일반적
        int[][] a1 = new int[2][3];
        a1[0][0] = 1;
        a1[0][1] = 2;
        a1[0][2] = 3;
        a1[1][0] = 4;
        a1[1][1] = 5;
        a1[1][2] = 6;

        System.out.println(a1.length);
        System.out.println(a1[0].length);
        System.out.println();

        // 방법2. 배열객체의 행 성분 먼저 생성
        // 2차원 정방행렬이 아닌 경우, 사용 가능
        int[][] a2 = new int[2][];
        a2[0] = new int[3];
        a2[1] = new int[3];
        a2[0][0] = 1;
        a2[0][1] = 2;
        a2[0][2] = 3;
        a2[1][0] = 4;
        a2[1][1] = 5;
        a2[1][2] = 6;

        // 방법3. new 키워드와 함께 대입할 값 입력
        // 이중 중괄호가 있는 것에 주의!!!
        int[][] a3 = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(a3.length);
        System.out.println(a3[0].length);
        System.out.println(a3[1].length);
        System.out.println();

        // 방법4. new 키워드 없이 대입할 값만 입력
        int[][] a4 = {{1,2,3}, {4,5,6}};
        System.out.println(a4.length);
        System.out.println(a4[0].length);
        System.out.println(a4[1].length);
        System.out.println();

        // 2차원 비정방 배열
        int[][] a5 = new int[2][];
        a5[0] = new int[]{1,2};
        a5[1] = new int[]{3,4,5};
        System.out.println(a5.length);
        System.out.println(a5[0].length);
        System.out.println(a5[1].length);
        System.out.println();

        // 2차원 배열의 출력
        for (int i=0; i<a5.length; i++) {
            for (int j=0; j<a5[i].length; j++) {
                System.out.print(a5[i][j] + " ");
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(args));

    }
}
