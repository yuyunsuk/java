package Java240313.inheritance;
// 상속관계 만들기
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Java240313InheritanceEx02 {
    public static void main(String[] args) {

        // A 타입의 다형적 표현
        A a1 = new A(); // 부모 클래스 타입으로 선언해도 가능
        A a2 = new B(); // 부모 클래스 타입으로 선언해도 가능
        A a3 = new C(); // 부모 클래스 타입으로 선언해도 가능
        A a4 = new D(); // 부모 클래스 타입으로 선언해도 가능

        // B 타입의 다형적 표현
        //B b1 = new A(); // 에러
        B b2 = new B(); // 부모 클래스 타입으로 선언해도 가능
        B b3 = new C(); // 부모 클래스 타입으로 선언해도 가능
        B b4 = new D(); // 부모 클래스 타입으로 선언해도 가능

        // C 타입의 다형적 표현
        //C c1 = new A(); // 에러
        //C c2 = new B(); // 에러
        C c3 = new C(); // 부모 클래스 타입으로 선언해도 가능
        //C c4 = new D(); // 에러

        // D 타입의 다형적 표현

        //D d1 = new A(); // 에러
        //D d2 = new B(); // 에러
        //D d3 = new C(); // 부모 클래스 타입으로 선언해도 가능
        D d4 = new D(); // 에러

    }
}
