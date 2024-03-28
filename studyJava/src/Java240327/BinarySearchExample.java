package Java240327;

public class BinarySearchExample {

    // 바이너리 서치는 기본적으로 순서대로 정렬되어 있어야 함
    public static void binarySearch(int arr[], int first, int last, int key){ // arr 배열과, 처음, 끝, key 값을 입력받음
        int mid = (first + last)/2; // mid 에 중간값 저장 (0+4)/2 => 2
        while( first <= last ){ // while (0 <= 4) 동안 반복
            if ( arr[mid] < key ){ // 만약 key 값이 배열 중간위치 값보다 작으면 => (arr[2] < 30)
                first = mid + 1;   // 만약 key 값이 배열 중간위치 값보다 작으면 => first 를 (중간 index + 1)로 저장
            }else if ( arr[mid] == key ){ // 만약 key 값이 배열 중간위치 값하고 같으면 위치 index 출력 후 중지
                System.out.println("Element is found at index: " + mid);
                break;
            }else{              // 만약 key 값이 배열 중간위치 값보다 크면
                last = mid - 1; // 만약 key 값이 배열 중간위치 값보다 크면 last 를 (중간 index - 1)로 저장
            }
            mid = (first + last)/2; // 배열 중간위치 값 재조정
        }
        if ( first > last ){ // first 값이 last 값보다 크면
            System.out.println("Element is not found!");
        }
    }

    // int arr[] = {10,20,30,40,50}, first = 0, last=arr.length-1=4, key = 30
    // mid = (0 + 4)/2 => 2, while(0 <= 4)

    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }

}
