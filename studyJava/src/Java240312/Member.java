package Java240312;

public class Member {
    static String name;
    int age;

    static { // 정적 초기화 블럭
        name = "steve";
    }

    public Member() {
    }

    public Member(int age) {
        this.age = age;
    }
}
