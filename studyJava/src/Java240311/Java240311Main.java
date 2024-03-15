package Java240311;

public class Java240311Main {
    public static void main(String[] args) {
        Students a = new Students(); // Students 클래스에서 생성자를 지워도 컴파일러가 기본 생성자를 자동으로 추가해줌.
                                     // 클래스의 생성자가 없는 경우 => 기본생성자가 자동으로 만들어짐
                                     // 매개변수가 있는 생성자만 있는 경우 => 기본생성자는 만들어지지 않는다!!
        Students tom = new Students("tom",20,"Seoul","12345");
        Students steve = new Students("steve",25,"LA"); // 생성자의 오버로딩 가능

    }
}
