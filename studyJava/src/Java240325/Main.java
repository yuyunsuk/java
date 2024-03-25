package Java240325;

abstract class JavaAbstract {
    // 필드
    int a;
    String b;

    // 생성자
    public JavaAbstract() { // 기본 생성자
        a = 10;
        b = "default";
    };

    public JavaAbstract(int a, String b) {
        this.a = a;
        this.b = b;
    }

    // 메서드
    public int getValue() {
        return a;
    }

    abstract public String getString(); // 추상메서드

    public void setValue(int a) { // 세터(Setter) 메서드
        this.a = a;
    }

    public void setString(String b) { // 세터(Setter) 메서드
        this.b = b;
    }



}

public class Main {
    public static void main(String[] args) {
        //JavaAbstract javaAbstract = new JavaAbstract(); // 추상클래스는 인스턴스화 안됨.
        JavaChild javaChild = new JavaChild(); // 추상클래스를 상속한 클래스는 인스턴스화 가능
        System.out.println(javaChild.getValue());
        System.out.println(javaChild.getString());

//        JavaAbstract javaAbstract1 = new JavaAbstract(20, "Apple");
//        System.out.println(javaAbstract1.getValue());
//        System.out.println(javaAbstract1.getString());

        JavaChild javaChild1 = new JavaChild(20, "Apple");
        System.out.println(javaChild1.getValue());
        System.out.println(javaChild1.getString());

        JavaChild javaChild2 = new JavaChild();
        javaChild2.setValue(999);
        javaChild2.setString("Banana");
        System.out.println(javaChild2.getValue());
        System.out.println(javaChild2.getString());



    }
}
