package Java240313.overriding;

class A {
    int m = 3;
}
class B extends A {
    int m = 4;
}

public class Java240313OverridingE01 {
    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        A ab = new B();

        // 인스턴스 필드
        System.out.println(aa.m); // 3
        System.out.println(bb.m); // 4
        System.out.println(ab.m); // 3

        A ab2 = bb; // 업캐스팅

        System.out.println(ab2.m); // 3

    }
}
