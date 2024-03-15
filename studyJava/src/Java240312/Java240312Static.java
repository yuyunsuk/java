package Java240312;

public class Java240312Static {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        print();
        //print(a); // static 영역에 없음
        print(b); //가능
    }

    public static void print() {
        System.out.println("Hello World");
    }

    public static void print(int x) {
        System.out.println(x);
    }

}
