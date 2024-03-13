import java.util.Scanner;

public class Java240313Test4 {
    public static void main(String[] args) {

        //int n = 3;

        Scanner sc = new Scanner(System.in);
        System.out.print("반복횟수를 입력하여 주세요 : ");
        int n = sc.nextInt();

        int [] arr = new int [] {1, 2, 3, 4, 5}; // 입력 배열

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) { // 입력 배열 출력
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){ // 3번 반복
            //int j, first;
            int j, lastNum;

            lastNum = arr[arr.length-1];  // 포인트 1 => lastNum 에 원본 또는 수정전 배열의 마지막값 입력

            for(j = arr.length-1; j > 0; j--){ // 4번 반복, (입력 배열 갯수-1)번 반복
                arr[j] = arr[j-1];
            }

            arr[0] = lastNum;  // 포인트 2 => 수정된 첫번째 배열에 수정전 배열의 마지막값을 입력
        }
        System.out.println();
        // (i = 0) => j 0~4 jrr[0] = 5, jrr[1] = 1, jrr[2] = 2, jrr[3] = 3, jrr[4] = 4
        // (i = 1) => j 0~4 jrr[0] = 4, jrr[1] = 5, jrr[2] = 1, jrr[3] = 2, jrr[4] = 3
        // (i = 2) => j 0~4 jrr[0] = 3, jrr[1] = 4, jrr[2] = 5, jrr[3] = 1, jrr[4] = 2

        for(int i = 0; i< arr.length; i++){ // 변경된 arr 배열 출력
            System.out.print(arr[i] + " ");
        }
        // arr => {4,5,1,2,3}

    }
}
