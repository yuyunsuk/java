package Java240326.Ex02;

public class InsertionSortExample {

    // Insertion 정렬의 알고리즘을 이해하고
    // 어떤 정렬상태가 주어졌을때 가장 빨리 정렬을 마무리할지 생각해봅시다!! = Best Case
    // 반대로 어떤 정렬 상태가 주어졌을때 가장 오래 걸릴까?? = Worst Case
    public static void insertionSort(int array[]) {
        int n = array.length; // 배열의 갯수
        for (int j = 1; j < n; j++) { // j 는 1부터 배열의 갯수만큼 반복
            int key = array[j];
            int i = j-1; // j보다 1 적은 수
            while ( (i > -1) && ( array [i] > key ) ) { // i가 -1보다 크고, i번째 배열이 key 보다 크면 (기준값보다 크면 뒤로)
                array [i+1] = array [i]; // i번째 배열을 (i+1)번째 배열에 넣음
                i--; // i를 -1씩 뺌
            }
            array[i+1] = key; // (i+1)번째 배열에 key 값을 넣음
        }
    }

    //         0  1 2 3  4  5  6  7
    // arr1 = {9,14,3,2,43,11,58,22};
    // n = 8, j = 1 부터, array[1]=14, key = (14), i = 0, array[0] = 9 , (9) >(14) array 값이 key 값보다 크면 해당값을 arr1 뒤배열에 넣음 {9,14,3,2,43,11,58,22}

    // n = 8, j = 2 부터, array[2]=3 , key = (3) , i = 1, array[1] = 14, (14)> (3) array 값이 key 값보다 크면 해당값을 arr1 뒤배열에 넣음 {9,(3,14),2,43,11,58,22}
    // n = 8, j = 2 부터, array[2]=3 , key = (3) , i = 0, array[0] = 9 ,  (9)> (3) array 값이 key 값보다 크면 해당값을 arr1 뒤배열에 넣음 {(3,9),14,2,43,11,58,22}

    // n = 8, j = 3 부터, array[3]=2 , key = (2) , i = 2, array[2] = 14, (14)>(2)  array 값이 key 값보다 크면 해당값을 arr1 뒤배열에 넣음 {3,9,(2,14),43,11,58,22}
    // n = 8, j = 3 부터, array[3]=2 , key = (2) , i = 1, array[1] = 14, (14)>(2)  array 값이 key 값보다 크면 해당값을 arr1 뒤배열에 넣음 {3,(2,9),14,43,11,58,22}
    // n = 8, j = 3 부터, array[3]=2 , key = (2) , i = 0, array[0] = 14, (14)>(2)  array 값이 key 값보다 크면 해당값을 arr1 뒤배열에 넣음 {(2,3),9,14,43,11,58,22}

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }

}
