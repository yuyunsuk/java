package Java240408;

class A {
    int m = 3;
    int n = 5;
    void abc() {
        int n = 5;
        n = n + 1;
        System.out.println(n);
        class B {
            void bcd() {
                m = m + 1;
                System.out.println(m);
                //n = n + 1; // 지역 이너클래스에서 지역변수를 사용하면, 지역변수가 자동으로 final 로 변경됨, 값 변경 불가
            }
        }
        B bb = new B();
        bb.bcd();
    }
}

public class E01 {
    public static void main(String[] args) {
        A a = new A();
        a.abc();
    }
}