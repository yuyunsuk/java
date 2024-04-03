package Java240403;

interface A {
    void method1(); // 입력 X, 리턴 X
}
interface B {
    void method2(int x); // 입력 O, 리턴 X
}
interface C {
    int method3(); // 입력 X, 리턴 O
}
interface D {
    double method4(int x, double y); // 입력 O, 리턴 O
}

public class LambdaExpression {
    public static void main(String[] args) {

        A a0 = new A(){ // 익명 이너 클래스
            public void method1()
            {
                System.out.println("pattern 1");
            };
        };
        a0.method1();

        A a = () -> System.out.println("pattern 1"); // 람다식 단축형
        a.method1();

        B b = (int x) -> System.out.println("pattern 2 : "+ x);
        B b1 = (x) -> System.out.println("pattern 2 : "+ x);
        B b2 = x -> System.out.println("pattern 2 : "+ x); // 매개변수가 하나인 경우만 소괄호 삭제
        b2.method2(5);

        C c = () -> {return 4; }; // return 이 있으므로 중괄호가 필요함.
        C c1 = () -> 4; // return 을 생략하려면 중괄호도 같이 생략해야 함.

        System.out.println(c1.method3());

        D d = (int x, double y) -> {return x + y; };
        D d1 = (int x, double y) -> x + y;
        D d2 = (x, y) -> x + y;
        System.out.println(d2.method4(10, 5.5));

    }
}
