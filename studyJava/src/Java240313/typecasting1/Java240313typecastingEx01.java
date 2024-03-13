package Java240313.typecasting1;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Java240313typecastingEx01 {
    public static void main(String[] args) {
        // 업케스팅
        A ac = new C();
        B bc = new C();

        B bb = new B();
        A a = bb;

        // 다운캐스팅
        A aa = new A();
        //B b = (B) aa; // 다운캐스팅 컴파일 에러
        //C c = (C) aa; // 다운캐스팅 컴파일 에러

        A ab = new B();
        B b = (B) ab; // 수동변환 가능
        //C c = (C) ab; // 다운캐스팅 컴파일 에러, A->C 다운캐스팅 (수동변환) : 불가능

        // 실제코딩시
        if (ab instanceof B) { // 인스턴스에 B가 존재하면
            B b1 = (B) ab;
        } else if (ab instanceof C) {
            C c1 = (C) ab; // A->C 다운캐스팅 (수동변환) : 불가능
        } else {
            // 에러
            System.out.println("다운캐스팅 에러");
        }

        B bd = new D();
        D d = (D) bd; // B -> D 다운캐스팅 (수동변환)

        A ad = new D();
        B b1 = (B) ad; // A -> B 다운캐스팅 (수동변환)
        D d1 = (D) ad; // A -> D 다운캐스팅 (수동변환)

    }
}
