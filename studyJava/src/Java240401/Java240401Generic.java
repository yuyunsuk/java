package Java240401;

class MyClass1<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}

class KeyValue<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

class MyClassABC<A,B,C> {
    private A a;
    private B b;
    private C c;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}

public class Java240401Generic {
    public static void main(String[] args) {

        MyClass1<String> mc1 = new MyClass1<String>(); // 클래스의 생성단계
        mc1.set("안녕"); // 생성단계에서 자료형을 결정했기 때문에 입력 단계에서 특정 자료형만 받음.
        System.out.println(mc1.get());

        MyClass1<Integer> mc2 = new MyClass1<>(); // Integer 는 int 자료형의 wrapper 클래스
        mc2.set(100);
        System.out.println(mc2.get());

        System.out.println();

        KeyValue<String, Integer> kv1 = new KeyValue<>();
        kv1.setKey("사과");
        kv1.setValue(1000);
        System.out.println(kv1.getKey() + " : " + kv1.getValue());

        // 두번째 제네릭을 사용하지 않더라도 void 타입을 지정해줘야 함.
        KeyValue<String, Void> kv3 = new KeyValue<>();
        kv3.setKey("키 값만 사용");
        System.out.println("Key: " + kv3.getKey());

        MyClassABC<String, Integer, Double> abc = new MyClassABC<>();
        abc.setA("3개의 제네릭");
        abc.setB(500);
        abc.setC(5.5);
        System.out.println(abc.getA() + " " + abc.getB() + " " + abc.getC());



    }
}
