package Java240304;

public class Java240304Array {
    public static void main(String[] args) {
        // 1. 배열의 기본 선언법
        int[] intArray1 = {1,2,3,4,5};
        System.out.println(intArray1[0]);

        // 2. Case2
        int[] intArray2 = new int[5]; // new 는 heap 에 메모리 생성
        //intArray2 = {1,2,3,4,5}; // 오류
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;
        intArray2[4] = 5;
        System.out.println(intArray2[4]);

        // 3. Case3
        int[] intArray3 = new int[50];
        // int[] intArray3 = 가변의 길이를 가진 배열을 저장함
        for (int i=0; i<intArray3.length; i++) {
            intArray3[i] = i+1;
            System.out.print(intArray3[i] + " ");
        }
        System.out.println();

        // 4. Case4
        int[] intArray4 = new int[]{1,2,3,4,5};
        System.out.println(intArray4[4]);
        System.out.println();

        // 배열의 복사 (= 참조복사)
        String[] str1 = {"black", "red", "white"};
        String[] str2 = str1; // 값이 같이 바뀜, heap 메모리의 같은 주소를 가지고 있음
        System.out.println("1 " + str2[0]);

        str2[0] = "white";
        System.out.println("2 " + str2[0]);
        System.out.println("3 " + str1[0]);

        // 기본자료형의 복사 (= 값복사)
        int a = 3;
        int b = a;
        System.out.println("1 " + b);
        b = 6;
        System.out.println("2 " + b);
        System.out.println("3 " + a);

        System.out.println("안녕"+5.8);
        System.out.print(3+5+"방가"+4+2);
        System.out.printf(" %s:%d","홍길동",15);

        System.out.println((int)5.6 + 3.5);
        System.out.println((int)5.6 + (int)3.5);
        System.out.println((int)(5.6 + 3.5));
        System.out.println(7/4);
        System.out.println((double)3 / 2);
        System.out.println((double)(3/2));



    }
}
