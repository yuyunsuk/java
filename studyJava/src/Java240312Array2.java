import java.util.Arrays;

public class Java240312Array2 {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; // 9개 int 배열
        int [] fr = new int [arr.length]; // 9개 int 배열 생성
        int visited = -1; // visited 는 -1
        for(int i = 0; i < arr.length; i++){ // 9번 반복문 (0~8)
            int count = 1; // 일단 각각 하나씩 있기 때문에 1로 시작
            for(int j = i+1; j < arr.length; j++){ // 9번 반복문(시작위치 1~9, 2~9, 3~9,...)
                if(arr[i] == arr[j]){ // 처음 숫자[1]와 나머지 것들 중 같은것이 있으면 count 증가, fr 의 해당 배열 번째에 -1 입력
                    count++;
                    fr[j] = visited; // fr[0,0,0,0,0,0,0,0,-1]
                }

            }
            if(fr[i] != visited) {// 배열의 값이 -1이 아니면, fr 의 첫번째에 count 값 입력
                fr[i] = count; // fr[2,0,0,0,0,0,0,0,-1]
            }
            System.out.println("i = "+i+", fr = "+Arrays.toString(fr));
        }

        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited) // 배열의 값이 -1이 아니면
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }

        System.out.println();
        System.out.println(Arrays.toString(fr)); // fr[2,4,1,1,-1,-1,-1,1,-1]
        // 중간에 중복된 3번 빠지도록 추가
    }

}
