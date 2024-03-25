package Java240325;

public class JavaChild extends JavaAbstract {

    public JavaChild () {
        super();
    }

    public JavaChild(int a, String b) {
        super(a, b);
    }

    @Override
    public String getString() { // 추상클래스 관련 오버라이딩 반드시 필요
        //return "이것은 자식 클래스";
        return super.b;
    }

    public void setValue(int a) {
        super.setValue(a); // 자바스타일, 자바는 세터와 게터를 사용하는 것을 추천함!!!
        //super.a = a; // 가능은 하나 자바스타일 아님, 비추천
    }

    public void setString(String b) {
        super.setString(b);
    }



}
