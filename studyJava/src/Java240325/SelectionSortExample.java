package Java240325;

public class SelectionSortExample {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) // i는 0 부터 배열크기-1 만큼 반복
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){ // j는 i보다 1 큰거 부터 배열크기 만큼 반복
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index]; // 작은수는 arr[index]
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    //                                       0  1 2 3  4  5  6  7
    // i = 0, index = 0, j = 1 부터 7번 반복, [9,14,3,2,43,11,58,22], j = 2, index = 2, smallerNumber = 3, 9를 3자리에 넣고, 작은수 3을 첫번째 배열에 넣음
    // i = 0, index = 0, j = 1 부터 7번 반복, [9,14,3,2,43,11,58,22], j = 3, index = 3, smallerNumber = 2, 3을 2자리에 넣고, 작은수 2를 첫번째 배열에 넣음
    // 순서대로 작은수 부터 앞에서 정렬됨

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
