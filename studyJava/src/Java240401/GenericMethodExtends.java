package Java240401;

class AA {
    public <T extends Number> void method1(T t){
        System.out.println(t.intValue());
    }
}

interface MyInterface {
    public abstract void print();
}

class BB {
    public <T extends MyInterface> void method1(T t) {
        // 사용자가 정의한 MyInterface 의 자식만 제네릭T 위치에 올 수 있음
        // 이렇게 함으로써 사용자 정의 메서드만 print()를 사용할 수 있게 됨.
        t.print();
    }
}

class CC implements MyInterface{
    @Override
    public void print() {
        System.out.println("print() 구현 2");
    }
}

public class GenericMethodExtends {
    public static void main(String[] args) {
        AA a = new AA();
        a.method1(5.8); // <Double>

        BB b = new BB();
        b.method1(new MyInterface() { // 1) 익명 이너 클래스 사용한 경우
            @Override
            public void print() {
                System.out.println("Print() 구현");
            }
        });

        b.method1(new CC()); // 2) MyInterface 의 구현체를 사용한 경우



    }
}
