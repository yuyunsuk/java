package Java240327;

public class LinearSearchExample {

    public static int linearSearch(int[] arr, int key){ // int arr 배열과 key 를 입력파라메터로 받음
        for(int i=0;i<arr.length;i++){ // i=0 부터 배열의 크기만큼 반복
            if(arr[i] == key){ // key 값이 해당인덱스 배열값과 같으면 인덱스 값 리턴
                return i;
            }
        }
        return -1;
    }

    // 배열 {10,20,30,50,70,90}, key = 50
    // 리턴 3

    public static void main(String a[]){
        int[] a1= {10,20,30,50,70,90};
        int key = 50;
        System.out.println(key+" is found at index: "+linearSearch(a1, key));
    }

}
