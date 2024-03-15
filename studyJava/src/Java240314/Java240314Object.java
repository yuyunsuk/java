package Java240314;

class MyClass2 {}

class A1 {
    String name;
    A1(String name) {
        this.name = name;
    }
}

class A2 {
    int data;
    A2(int data) {
        this.data = data;
    }

    public boolean equals (Object obj) {
        if (obj instanceof A2) {
            return this.data == ((A2)obj).data;
        }
        return false;
    }

}

public class Java240314Object {
    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        System.out.println(myClass2);
        System.out.println(myClass2.toString());

        A1 aa1 = new A1("안녕");
        A1 aa2 = new A1("안녕");

        System.out.println(aa1 == aa2);
        System.out.println(aa1.equals(aa2));

        String aa3 = new String("안녕");
        String aa4 = new String("안녕");

        System.out.println(aa3 == aa4);
        System.out.println(aa3.equals(aa4));
        System.out.println();

        A2 a1 = new A2(3);
        A2 a2 = new A2(3);
        System.out.println(a1.equals(a2));

    }
}
