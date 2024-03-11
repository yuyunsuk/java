import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

class A {
    int m;
    int n;
    void init(int m, int n) {
        m=m;
        n=n;
    }
}

class B {
    int m;
    int n;
    void init(int m, int n) {
        this.m=m;
        this.n=n;
    }
}

class C {
    void print(){
        System.out.println("입력값이 없습니다.");
    };
    void print(int a) {
        System.out.println(a);
    }
    void print(double a) {
        System.out.println(a);
    }
    void print(String a) {
        System.out.println(a);
    }
}

class D {
    int arraySum(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

class E {
    void abc(int m) {
        m = 8;
    }
    void bcd(int[] n){
        n[0] = 4; n[1] = 5; n[2] = 6;
    }
}

class F {
    void averageScore(int... values){
        int sum = 0;
        for (int i=0; i<values.length; i++) {
            sum += values[i];
        }
        System.out.println((float)sum / (float)values.length);
    }
}

class G {
    int m = 3;
    int n = 5;
    void abc(int m, int n) {
        m = this.m;
        n = n;
    }
}

class H {
    int a, b, c, d;
    H() { // 생성자는 Class 와 이름이 같아야 함
        this(5);
    }
    H(int k) { // 생성자는 Class 와 이름이 같아야 함
        a = k;
        b = k;
        c = k;
        d = k;
    }
}

public class Java240311Method
{
    static int a = 1;
    static int b = 2;

    public static void main(String[] args) {
        System.out.println(plusNums()); // System.out.println(3);
        System.out.println(plusNums(4, 5)); // System.out.println(9);
        int[] intArray = {1,2,3,4,5};
        System.out.println(plusNums(intArray, intArray.length)); // System.out.println({1,2,3,4,5}); => 에러
                                                // System.out.println(15);
                                                // 매개변수 2개인데 1개만 써도 에러가 안되는 이유는, 뒤에 int 는 자동으로 heap에서 초기화 시킴.
        System.out.println(plusNums(1,2,3,4,5,6)); // int[] 메소드와 같은 시그니처
        System.out.println();

        A a = new A();
        a.init(2,3);
        System.out.println(a.m);
        System.out.println(a.n);
        System.out.println();

        B b = new B();
        b.init(2,3);
        System.out.println(b.m);
        System.out.println(b.n);
        System.out.println();

        C c = new C();
        c.print();
        c.print(3);
        c.print(5.8);
        c.print("안녕");
        System.out.println();

        D d = new D();
        int[] data1 = new int[]{1,2,3};
        int[] data2 = {1,2,3};
        System.out.println(d.arraySum(data1));
        System.out.println(d.arraySum(data2));
        System.out.println(d.arraySum(new int[]{1,2,3}));
        //System.out.println({1,2,3}); // 오류
        System.out.println();

        E e = new E();
        int m = 5;
        int[] n = {1,2,3};

        e.abc(m);
        e.bcd(n);

        System.out.println(m);
        System.out.println(Arrays.toString(n));
        System.out.println();

        F f = new F();

        f.averageScore(1);
        f.averageScore(1,2);
        f.averageScore(1,2,3);
        f.averageScore(1,2,3,4);
        System.out.println();

        G g = new G();
        g.abc(7, 8);
        System.out.println(g.m);
        System.out.println(g.n);
        System.out.println();

        H h = new H();
        System.out.println(h.a);
        System.out.println(h.b);
        System.out.println(h.c);
        System.out.println(h.d);



    }

    // 메소드의 오버로딩
    public static int plusNums() {
        return a + b;
    }

    public static int plusNums(int x, int y) {
        return x + y;
    }

    public static int plusNums(int[] intArray, int length) {
        int sum = 0;
        for (int i=0; i<intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }

//    // 가변길이 배열 입력법이 필요한 이유
//    public static int plusNums(int a, int b, int c, int d, int e) {
//        return a + b + c + d + e;
//    }
//
//    public static int plusNums(int a, int b, int c, int d, int e, int f) {
//        return a + b + c + d + e + f;
//    }

    public static int plusNums(int... values) {
        int sum = 0;
        for (int i=0; i<values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }
}
