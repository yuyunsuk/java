import java.util.Scanner;

public class Java240308Test {

    static class A {
        boolean a;
        int b;
        double c;
        String d;

        void abc() {
            System.out.println(b + c);
            System.out.println(c + d);
            System.out.println(d + a);
        }
    }

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
        System.out.println();

        a.abc();

        // 1. 양의 정수 10개를 입력.
        // 2. 배열에 담는다.
        // 3. 3의 배수만 출력.

        Scanner sc = new Scanner(System.in);
        int[] intInput = new int[10];

        System.out.println("양의 정수 10개를 입력해 주세요 : ");
        for (int i=0; i<10; i++) {
            intInput[i] = sc.nextInt();
        }
        System.out.println("입력 종료!");

        for (int i=0;i<intInput.length; i++) {
            if (intInput[i] % 3 == 0) {
                System.out.println(intInput[i]);
            }
        }

        

    }
}
