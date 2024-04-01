package Java240401.Q01;

class MyGeneric <T> {
    T t;
    public T get(){
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}

class A {
    @Override
    public String toString() {
        return "클래스 A 객체";
    }
}

class B {
    @Override
    public String toString() {
        return "클래스 B 객체";
    }
}

public class Main {
    public static void main(String[] args) {
        A a_in = new A();
        B b_in = new B();

        MyGeneric<A> mg1 = new MyGeneric<>();
        mg1.set(a_in);
        A a_out = mg1.get();
        System.out.println(a_out);

        MyGeneric<B> mg2 = new MyGeneric<>();
        mg2.set(b_in);
        B b_out = mg2.get();
        System.out.println(b_out);

    }
}
